package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ContectController {//문의 페이지(정보 입력, 문의 작성)
    @GetMapping("/contact")
    public String saveContactInquiryDetails() {
        return "dd";
    }
}
