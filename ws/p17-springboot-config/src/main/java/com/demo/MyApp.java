package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp implements CommandLineRunner {

    @Value("${uname}")
    private String username;

    @Value("${qtpp}")
    private String qtpp;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(username);
        System.out.println("QTPP: "+qtpp);
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

}
