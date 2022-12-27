package com.demo.utils;


public class GreetingDemo2 {
    
    public String greet(String name) throws Exception {

        if(name == null || name.length()==0){
            throw new Exception("Invalid data");
        }
        return "Welcome "+name;
    }

}
