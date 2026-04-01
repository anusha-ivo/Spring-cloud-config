package com.example.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controlleruse {
    @Value("${message}")
    private String message;
    @GetMapping("/msg")
    public String get(){
        return message;
    }
}
