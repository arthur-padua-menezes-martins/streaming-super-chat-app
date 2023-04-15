package com.streamingsuperchatapp.collector.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperChatCollector {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
