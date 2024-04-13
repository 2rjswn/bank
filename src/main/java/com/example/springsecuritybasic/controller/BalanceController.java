package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BalanceController {
    @GetMapping("/myBalance")
    public String getBalanceDetails() {
        return "ff";
    }
}
