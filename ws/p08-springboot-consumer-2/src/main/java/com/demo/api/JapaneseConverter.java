package com.demo.api;

import org.springframework.stereotype.Component;

@Component
public class JapaneseConverter implements MessageConverter {

	@Override
	public void translate(String message) {
		System.out.println("Japanese: "+message);
	}
	
}
