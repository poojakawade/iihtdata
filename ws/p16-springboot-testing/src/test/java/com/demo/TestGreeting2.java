package com.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.utils.GreetingDemo2;

@SpringBootTest
public class TestGreeting2 {

    GreetingDemo2 greeting;

    @BeforeEach
    public void setUp(){
        greeting = new GreetingDemo2();
    }
    @AfterEach
    public void tearDown(){
        greeting = null;
    }
    
    @Test
    public void shouldGreetUserWithName() throws Exception{
        String actual = greeting.greet("arun");

        Assertions.assertEquals("Welcome arun", actual);
    }

    @Test
    public void shouldNotGreetUserWithEmptyString()  throws Exception{
        Assertions.assertThrows(Exception.class, ()->{
            greeting.greet("");
        });
    }

    @Test
    public void shouldNotGreetUserWithNull() throws Exception{
        Assertions.assertThrows(Exception.class, ()->{
            greeting.greet(null);
        });
    }

    
}
