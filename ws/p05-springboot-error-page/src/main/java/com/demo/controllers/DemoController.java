package com.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@CrossOrigin("*")
public class DemoController {

	// @RequestMapping(method = get, value="url")
	@GetMapping("/heros")
	@ResponseBody
	public List<String> getHeros() {
		System.out.println("In getHeros");
		return Arrays.asList("Superman", "WondarWoman", "Spiderman", "Ironman", "Antman", "Shaktiman", "Hanuman");
	}

	@GetMapping("/greet")
//  @ResponseBody
	public String greetUser() {
		return "welcome";
	}

	@PostMapping("/play")
	@ResponseBody
	public String playGame() {
		return "Chess";
	}
	
	
	@GetMapping("/div") // /div?x=6.3&y=2.1
	@ResponseBody
	public int process(@RequestParam int x, @RequestParam int y) {
		return x/y;
	}
	

	// localhost:8080/signin
	

}
