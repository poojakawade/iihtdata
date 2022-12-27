package com.demo.utils;

import com.demo.exceptions.InvalidArgumentException;

public class GreetingDemo1 {
    
    public String greet(String name) throws InvalidArgumentException {

        if(name == null){
            throw new NullPointerException();
        } else if(name.length()==0){
            throw new InvalidArgumentException("Empty name");
        }
        return "Welcome "+name;
    }

}
