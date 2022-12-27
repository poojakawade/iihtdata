package com.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    // @RequestMapping(method = get, value="url")
    @GetMapping("/heros")
    public List<String> getHeros(){
        return Arrays.asList(
            "Superman",
            "WondarWoman",
            "Spiderman",
            "Ironman",
            "Antman",
            "Shaktiman",
            "Hanuman"
        );
    }

}
