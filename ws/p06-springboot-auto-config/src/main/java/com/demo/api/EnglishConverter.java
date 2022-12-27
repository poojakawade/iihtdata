package com.demo.api;

public class EnglishConverter implements MessageConverter {

	@Override
	public void translate(String message) {
		System.out.println("English: "+message);
	}
	
}
