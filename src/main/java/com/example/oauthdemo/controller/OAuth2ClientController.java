package com.example.oauthdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OAuth2ClientController {
    @GetMapping("/order")
    public String order() {
        return "I am order";
    }

    @GetMapping("/order1")
    public String order1() {
        return "I am order1";
    }
}
