package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoansController {
    @GetMapping("/myLoans")
    public String getLoanDetails() {
        return "dd";
    }
}
