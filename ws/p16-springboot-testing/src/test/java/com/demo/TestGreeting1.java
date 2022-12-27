package com.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.exceptions.InvalidArgumentException;
import com.demo.utils.GreetingDemo1;

@SpringBootTest
public class TestGreeting1 {

    GreetingDemo1 greeting;

    @BeforeEach
    public void setUp(){
        greeting = new GreetingDemo1();
    }
    @AfterEach
    public void tearDown(){
        greeting = null;
    }
    
    @Test
    public void shouldGreetUserWithName() throws InvalidArgumentException{
        String actual = greeting.greet("arun");

        Assertions.assertEquals("Welcome arun", actual);
    }

    @Test
    public void shouldNotGreetUserWithEmptyString()  throws InvalidArgumentException{
        Assertions.assertThrows(InvalidArgumentException.class, ()->{
            greeting.greet("");
        });
    }

    @Test
    public void shouldNotGreetUserWithNull() throws InvalidArgumentException{
        Assertions.assertThrows(NullPointerException.class, ()->{
            greeting.greet(null);
        });
    }

    
}
