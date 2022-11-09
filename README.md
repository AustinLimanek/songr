# Songr

Spring MVC project that handles album information and presents that information to the user. The user may add their albums to the main page of the application.

To run the program use `./gradlew runBoot`. Use `localhost:8080` as the root of the application.

## Installation

Fork the repo and add the users desired database technology information to the application.properties file. 

        spring.datasource.url=jdbc:postgresql://localhost:5432/songr
        spring.datasource.username=postgres
        spring.datasource.password=

The user will need to input their own server name in place of `songr`, the name of the user for `postgres`, and finally the password, if applicable, after the equals sign.

Without this information, the application will not build appropriately.

## For functionality: 

On the home page you can add an album by filling out information on the form provided on the top of the page. `Title`, `Artist`, `Song Count`, `Length`, and `imageUrl` inputs are provided.

`./capitalize/<your message>`: type whatever you want in the `<your message> to see that message become capitalized.

`./albums`: see information such as `title`, `artist`, `song count`, `length (in seconds)`, and an image of the album.