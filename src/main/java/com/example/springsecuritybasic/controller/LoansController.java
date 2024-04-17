package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {//대출 정보(대출 총액, 대출 종류)
    @GetMapping("/myLoans")
    public String getLoanDetails() {
        return "dd";
    }
}
