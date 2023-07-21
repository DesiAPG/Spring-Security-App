package com.example.springsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class CustomerController {
    @GetMapping("/index")
    public String index() {
        return "Secured";
    }

    @GetMapping("/index2")
    public String index2() {
        return "NOT SECURED";
    }
}
