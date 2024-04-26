package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {//은행 카드(한도)
    @GetMapping("/myCards")
    public String getCardDetails() {
        return "ff";
    }
}
