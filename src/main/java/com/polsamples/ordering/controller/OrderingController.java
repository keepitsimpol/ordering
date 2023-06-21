package com.polsamples.ordering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderingController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}