package com.demo.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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

    @Cacheable(key="#movieId", value = "MovieArea")
    public Movie getMovieById(int movieId) throws MovieException{
    	
    	System.out.println("finding movie by id("+movieId+"): "+LocalDateTime.now());
    	
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

    @CachePut(key="#id", value = "MovieArea")
    public Movie updateMovie(int id, Movie movie) throws MovieException{
    	if(repo.existsById(id)) {
    		movie.setId(id);
    		return repo.save(movie);
    	} else {
    		throw new MovieException("Movie not updated with id: "+id);
    	}
    }

    @CacheEvict(key="#movieId", value = "MovieArea")
    public Movie delete(int movieId) throws MovieException{
    	Optional<Movie> optional = repo.findById(movieId);

        if(optional.isEmpty()){
            throw new MovieException("Movie not deleted with id: "+movieId);
        } else {
        	repo.deleteById(movieId);
            return optional.get();
        }
    }
    
}
