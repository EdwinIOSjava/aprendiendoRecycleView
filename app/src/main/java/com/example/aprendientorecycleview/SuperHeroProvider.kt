package com.example.aprendientorecycleview

class SuperHeroProvider {
    companion object {
        val superHeroList = listOf(
            SuperHero("Superman", "DC Comics", "Clark Kent", "https://example.com/superman.jpg"),
            SuperHero("Batman", "DC Comics", "Bruce Wayne", "https://example.com/batman.jpg"),
            SuperHero("Spider-Man", "Marvel", "Peter Parker", "https://example.com/spiderman.jpg"),
            SuperHero("Iron Man", "Marvel", "Tony Stark", "https://example.com/ironman.jpg"),
            SuperHero(
                "Wonder Woman",
                "DC Comics",
                "Diana Prince",
                "https://example.com/wonderwoman.jpg"
            ),
            SuperHero("Flash", "DC Comics", "Barry Allen", "https://example.com/flash.jpg"),
            SuperHero("Hulk", "Marvel", "Bruce Banner", "https://example.com/hulk.jpg"),
            SuperHero("Thor", "Marvel", "Thor Odinson", "https://example.com/thor.jpg"),
            SuperHero(
                "Black Panther",
                "Marvel",
                "T'Challa",
                "https://example.com/blackpanther.jpg"
            ),
            SuperHero(
                "Doctor Strange",
                "Marvel",
                "Stephen Strange",
                "https://example.com/doctorstrange.jpg"
            )
        )
    }
}