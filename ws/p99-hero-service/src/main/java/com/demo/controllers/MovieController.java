package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.exception.MovieException;
import com.demo.services.MovieService;

@RestController
// @CrossOrigin(origins = {"https://hoppscotch.io"})
@CrossOrigin
@RequestMapping("/api/v1")
public class MovieController {
    
    @Autowired
    private MovieService service;

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return service.getAllMovies();
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable int movieId) throws MovieException{
        return service.getMovieById(movieId);
    }

    @PostMapping("/movies")
    public Movie saveMovie(@RequestBody Movie movie){
        return service.saveMovie(movie);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updateMovie(@PathVariable int movieId, @RequestBody Movie movie){
        return service.updateMovie(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public Movie delete(@PathVariable int movieId){
        return service.delete(movieId);
    }
}
