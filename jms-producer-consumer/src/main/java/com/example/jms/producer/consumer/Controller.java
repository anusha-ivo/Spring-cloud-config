package com.example.jms.producer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Producer producer;
    @GetMapping("/produce")
    public String show(@RequestParam String name){
        producer.producer(name);
        return name;

    }
}
