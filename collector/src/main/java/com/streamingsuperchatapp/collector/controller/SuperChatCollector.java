package com.streamingsuperchatapp.collector.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SuperChatCollector {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
