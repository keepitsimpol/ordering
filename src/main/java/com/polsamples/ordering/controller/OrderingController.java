package com.polsamples.ordering.controller;

import com.polsamples.ordering.model.Candy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderingController {

    @GetMapping("/")
    public Candy index() {
        Candy candy1 = new Candy();
        candy1.setName("VeryBerry");
        candy1.setDescription("This VeryBerry is so delicious!");
        return candy1;
    }
}