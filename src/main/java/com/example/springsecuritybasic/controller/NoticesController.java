package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class NoticesController {//공지사항 페이지(공지 개시)
    @GetMapping("/notices")
    public String getNotices() {
        return "dd";
    }
}
