package com.example.springsecuritybasic.controller;

import com.example.springsecuritybasic.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final CustomerRepository customerRepository;


}
