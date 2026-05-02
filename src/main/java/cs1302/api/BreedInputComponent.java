package cs1302.api;

import javafx.scene.layout.HBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import com.google.gson.Gson;

/**
 * A component for selecting a dog breed and triggering a search.
 */
public class BreedInputComponent extends HBox {

    ComboBox<String> breedBox;
    Button searchButton;
    HttpClient client;
    Gson gson;

    /**
     * Constructs a BreedInputComponent with the given result component.
     *
     * @param resultComponent the component to update with search results
     */
    public BreedInputComponent(BreedResultComponent resultComponent) {
        breedBox = new ComboBox<>();
        searchButton = new Button("Search");
        client = HttpClient.newHttpClient();
        gson = new Gson();
        loadBreeds();
        searchButton.setOnAction(e -> {
            String breed = breedBox.getValue();
            if (breed == null) {
                return;
            } // if
            try {
                // fetch dog image
                HttpRequest dogRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://dog.ceo/api/breed/" + breed + "/images/random"))
                    .build();
                HttpResponse<String> dogResponse = client.send(dogRequest,
                    HttpResponse.BodyHandlers.ofString());
                DogImageResponse dogImage = gson.fromJson(dogResponse.body(),
                    DogImageResponse.class);
                // fetch wikipedia summary
                String wikiUrl = "https://en.wikipedia.org/api/rest_v1/page/summary/"
                    + breed + "_dog";
                HttpRequest wikiRequest = HttpRequest.newBuilder()
                    .uri(URI.create(wikiUrl))
                    .header("User-Agent", "cs1302-api-app/1.0 (ncb10741@uga.edu)")
                    .build();
                HttpResponse<String> wikiResponse = client.send(wikiRequest,
                    HttpResponse.BodyHandlers.ofString());
                WikiResponse wiki = gson.fromJson(wikiResponse.body(),
                    WikiResponse.class);
                resultComponent.update(breed, dogImage.message, wiki.extract);
            } catch (IOException | InterruptedException ex) {
                System.err.println("Error fetching data: " + ex.getMessage());
            } // try
        });
        this.getChildren().addAll(breedBox, searchButton);
    } // BreedInputComponent

    /**
     * Loads all dog breeds from the Dog CEO API into the combo box.
     */
    private void loadBreeds() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dog.ceo/api/breeds/list/all"))
                .build();
            HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
            BreedListResponse breedList = gson.fromJson(response.body(),
                BreedListResponse.class);
            breedBox.getItems().addAll(breedList.message.keySet());
        } catch (IOException | InterruptedException e) {
            System.err.println("Error loading breeds: " + e.getMessage());
        } // try
    } // loadBreeds

} // BreedInputComponent
