package com.example.it211_ss4_bai1;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList; import java.util.List;



@RestController

public class MovieController {

    static class Movie {

        private String movieId; private String title;

        private String genre; private double rating;

        public Movie(String movieId, String title, String genre, double rating) {

            this.movieId=movieId; this.title=title;

            this.genre=genre; this.rating=rating;

        }

        // ... getters & setters ...

    }
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("M001", "Inception", "Sci-Fi", 8.8));
        movies.add(new Movie("M002", "Parasite", "Drama", 8.6));
        return movies;

    }
}
