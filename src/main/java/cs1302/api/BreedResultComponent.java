package cs1302.api;

import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * A component for displaying dog breed search results.
 */
public class BreedResultComponent extends VBox {
    ImageView dogImage;
    Label breedName;
    Label wikiSummary;

    /**
     * Constructs a BreedResultComponent with default values.
     */
    public BreedResultComponent() {
        dogImage = new ImageView();
        breedName = new Label("Breed: ");
        wikiSummary = new Label("Summary: ");

        // make the image a reasonable size
        dogImage.setFitWidth(400);
        dogImage.setPreserveRatio(true);

        // allow the summary text to wrap
        wikiSummary.setWrapText(true);
        wikiSummary.setMaxWidth(400);

        this.getChildren().addAll(dogImage, breedName, wikiSummary);
    } // BreedResultComponent

    /**
     * Updates the component with new breed information.
     *
     * @param breed the name of the breed
     * @param imageUrl the URL of the dog image
     * @param summary the Wikipedia summary for the breed
     */
    public void update(String breed, String imageUrl, String summary) {
        Image img = new Image(imageUrl, true);
        dogImage.setImage(img);
        breedName.setText("Breed: " + breed);
        wikiSummary.setText(summary != null ? summary : "No Wikipedia summary available. ");
    } // update

} // BreedResultComponent
