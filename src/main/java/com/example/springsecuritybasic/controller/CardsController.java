package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CardsController {
    @GetMapping("/myCards")
    public String getCardDetails() {
        return "gg";
    }
}
