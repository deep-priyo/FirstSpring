package com.example.demo;
// controller is used for handling http requests

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/hello") // so when u go to hello url return these like flask decorator ... get mapping means get request
    public String hello()
    {
        return "Hello World";
    }
}
