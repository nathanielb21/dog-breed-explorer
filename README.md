# Dog Breed Explorer

A JavaFX desktop app that lets you search for a dog breed and see its photo and a short description, pulled live from two public REST APIs.

## Features
- Search any dog breed by name
- Fetches data from two external REST APIs (the Dog API and Wikipedia)
- Loads data in a background thread, so the window never freezes while waiting on the network

## Built with
Java, JavaFX, Maven, REST APIs (JSON)

## How it works
- `ApiApp` builds the window and wires everything together
- `BreedInputComponent` and `BreedResultComponent` are the search box and the results panel
- `BreedListResponse`, `DogImageResponse` and `WikiResponse` map the JSON from each API into Java objects

## Run it
1. Get a free key from the Dog API.
2. Put it in `resources/config.properties`.
3. Run `./run.sh` (or `mvn javafx:run`).

## Screenshot
_Coming soon._
