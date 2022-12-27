package com.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.models.Show;

@RestController
@RequestMapping("/shows/v1")
public class ShowController {

	@Autowired
	private RestTemplate restTemplate;

//	localhost:port/shows/v1/superheros
	@GetMapping("/demoheros")
	public List<Show> getHeros(){
		return Arrays.asList(
			new Show(4, "Shaktiman"),
			new Show(4, "Hanuman"),
			new Show(4, "Superman"),
			new Show(4, "Ironman")
		);
	}
	
	@GetMapping("/superheros")
	public List<Show> getHerosFromDb(){
		
		HttpHeaders headers = null;
		
		ResponseEntity<List<Show>> responseEntity = restTemplate.exchange(
			"lb://HEROS-APP/api/v1/movies",
			HttpMethod.GET,
			new HttpEntity(null, headers),
			new ParameterizedTypeReference<List<Show>>() {}
		);
		return responseEntity.getBody();
	}
	
}
