package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.exception.MovieException;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repo;
    
    public List<Movie> getAllMovies(){
        return repo.findAll();
    }

    public Movie getMovieById(int movieId) throws MovieException{
        Optional<Movie> optional = repo.findById(movieId);

        if(optional.isEmpty()){
            throw new MovieException("Movie not found with id: "+movieId);
        } else {
            return optional.get();
        }
    }

    public Movie saveMovie(Movie movie){
        return repo.save(movie);
    }

    public Movie updateMovie(int id, Movie movie){
        return null;
    }

    public Movie delete(int movieId){
        return null;
    }
    
}
