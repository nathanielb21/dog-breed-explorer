
## Part 1.1: App Description

This app is a Dog Breed Explorer that allows users to select a dog breed
from a dropdown menu and view a random photo of that breed along with a
Wikipedia summary. It uses two RESTful JSON APIs: the Dog CEO API and the
Wikipedia REST API. The `BreedInputComponent` uses the Dog CEO API to
populate a ComboBox with all available breeds and fetch a random image on
search. The `BreedResultComponent` displays the image and the Wikipedia
summary fetched for the selected breed.

**GitHub URL:** https://github.com/nathanielb21/cs1302-api-app

## Part 1.2: APIs

### API 1

```
https://dog.ceo/api/breed/husky/images/random
```

```json
{
  "message": "https://images.dog.ceo/breeds/husky/n02110185_1469.jpg",
  "status": "success"
}
```

> No API key required.

### API 2

```
https://en.wikipedia.org/api/rest_v1/page/summary/husky_dog
```

```json
{
  "title": "Husky",
  "extract": "Husky is a general term for a sled-type of dog used in northern regions."
}
```

> No API key required. A User-Agent header must be set in requests.

## Part 2: New

I learned how to make HTTP requests in Java using HttpClient and how to
parse JSON responses into Java objects using Gson. I also learned how
JavaFX custom components work and how to structure a multi-component app.

## Part 3: Retrospect

If I could start over, I would plan the component structure more carefully
before writing code, since fixing indentation and style errors took more
time than expected. I would also test each API individually before
integrating them into the app.# Deadline

Modify this file to satisfy a submission requirement related to the project
deadline. Please keep this file organized using Markdown. If you click on
this file in your GitHub repository website, then you will see that the
Markdown is transformed into nice-looking HTML.

## Part 1.1: App Description

> Please provide a friendly description of your app, including the
> primary functions available to users of the app. Be sure to describe
> exactly what APIs two you are using and how they relate to your
> custom components.

> **Also, include the GitHub `https` URL to your repository.**

TODO WRITE / REPLACE

## Part 1.2: APIs

> For each RESTful JSON API that your app uses (at least two are
> required), include an example URL for a typical request made by your
> app as well as an example of a typical response in JSON. If you need
> to include additional notes (e.g., regarding API keys or rate
> limits), then you can do that below the URL/URI. Placeholders for
> this information are provided below. If your app uses more than two
> RESTful JSON APIs, then include them with similar formatting.

### API 1

```
https://.../replace/me
```

```json
{ replace with json }
```
> Replace this line with notes (if needed) or remove it (if not needed).

### API 2

```
https://../replace/me
```

```json
{ replace with json }
```

> Replace this line with notes (if needed) or remove it (if not needed).

## Part 2: New

> What is something new and/or exciting that you learned from working
> on this project?

TODO WRITE / REPLACE

## Part 3: Retrospect

> If you could start the project over from scratch, what do
> you think might do differently and why?

TODO WRITE / REPLACE
