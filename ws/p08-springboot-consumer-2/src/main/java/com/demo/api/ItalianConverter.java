package com.demo.api;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ItalianConverter implements MessageConverter {

	@Override
	public void translate(String message) {
		System.out.println("Italian: "+message);
	}
	
}
