package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.api.ItalianConverter;
import com.demo.api.JapaneseConverter;
import com.demo.api.MessageConverter;

@SpringBootApplication
public class MyApp implements CommandLineRunner {

	@Autowired
	private MessageConverter converter;
	
	@Autowired
	private ItalianConverter iConverter;
	@Autowired
	private JapaneseConverter jConverter;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		converter.translate("This is demo message");
		iConverter.translate("This is demo message");
		jConverter.translate("This is demo message");
	}
	
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
    
}
