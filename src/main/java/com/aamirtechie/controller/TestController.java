package com.aamirtechie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/test")
    public String getTest() {
        System.out.println("Service is Up & Running!...");
        return "Service is Up &&& Running!...";
    }

}
