package com.example.config.client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controllercls {
    @Value("${msg}")
    private String mytext;
    @GetMapping("/client")
    public String show(){
        return mytext;
    }

}
