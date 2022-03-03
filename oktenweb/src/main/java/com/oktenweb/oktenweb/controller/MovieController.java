package com.oktenweb.oktenweb.controller;


import com.oktenweb.oktenweb.entity.Movie;
import com.oktenweb.oktenweb.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class MovieController {
    @Autowired
    private  MovieService movieService;
    private List<Movie> movies = new ArrayList<>();

    {
        movies.add(new Movie(1, "Hello rembo", 179));
        movies.add(new Movie(2, "Lort Rotc", 129));
        movies.add(new Movie(3, "Home alone", 109));
    }

    @GetMapping(value = "/movie")
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping(value = "/movie")
    public Movie insertMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @PutMapping(value = "/movie/{id}")
    public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie) {
        return movieService.updateMovie(id, movie);
    }

    @DeleteMapping(value = "/movie/{id}")
    public void deleteMovie(@PathVariable int id) {
        movieService.deleteMovie(id);
    }
}
