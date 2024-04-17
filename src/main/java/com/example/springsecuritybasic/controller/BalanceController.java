package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {//잔고 페이지(잔고 총액, 최근 거래 내역)
    @GetMapping("/myBalance")
    public String getBalanceDetails() {
        return "dd";
    }
}
