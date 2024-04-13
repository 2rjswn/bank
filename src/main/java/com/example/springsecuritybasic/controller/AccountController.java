package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AccountController {
    @GetMapping("/myAccount")
    public String getAccountDetails() {
        return "dd";
    }
}
