package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {//계좌 보기(계좌번호, 이메일, 지점 주소)
    @GetMapping("/myAccount")
    public String getAccountDetails() {
        return "dd";
    }
}
