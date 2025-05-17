package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() throws InterruptedException {
        // Simulate delay
        Thread.sleep((long)(Math.random() * 1000));
        return "Hello, Prometheus!";
    }
}
