package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Movie;
import com.demo.services.MovieService;

@SpringBootApplication
public class P99HeroServiceApplication implements CommandLineRunner {
	@Autowired
	private MovieService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.saveMovie(new Movie("Superman", "Miley", 4.4));
		service.saveMovie(new Movie("Spiderman", "Clark", 4.4));
		service.saveMovie(new Movie("Ironman", "Tom", 4.4));
		service.saveMovie(new Movie("Antman", "John", 4.4));
		service.saveMovie(new Movie("Heman", "Mike", 4.4));
	}
	public static void main(String[] args) {
		SpringApplication.run(P99HeroServiceApplication.class, args);
	}

}
