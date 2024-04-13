package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class NoticesController {
    @GetMapping("/notices")
    public String getNotices() {
        return "gg";
    }
}
