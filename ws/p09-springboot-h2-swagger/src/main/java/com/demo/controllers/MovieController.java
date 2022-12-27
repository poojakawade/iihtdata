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
@RequestMapping("/api/v1/movies")
public class MovieController {
    
    @Autowired
    private MovieService service;

    @GetMapping()
    public List<Movie> getAllMovies(){
        return service.getAllMovies();
    }

    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable int movieId) throws MovieException{
        return service.getMovieById(movieId);
    }

    @PostMapping()
    public Movie saveMovie(@RequestBody Movie movie){
        return service.saveMovie(movie);
    }

    @PutMapping("/{movieId}")
    public Movie updateMovie(@PathVariable int movieId, @RequestBody Movie movie){
        return service.updateMovie(movieId, movie);
    }

    @DeleteMapping("/{movieId}")
    public Movie delete(@PathVariable int movieId){
        return service.delete(movieId);
    }
}
