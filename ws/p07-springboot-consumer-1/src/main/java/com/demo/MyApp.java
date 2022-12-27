package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

import com.demo.api.MessageConverter;

@SpringBootApplication
public class MyApp implements CommandLineRunner {

	@Autowired
	private MessageConverter converter;
	
	@Override
	public void run(String... args) throws Exception {
		converter.translate("This is demo message");
	}
	
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
    
}
