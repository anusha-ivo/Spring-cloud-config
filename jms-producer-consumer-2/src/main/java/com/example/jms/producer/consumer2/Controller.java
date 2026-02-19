package com.example.jms.producer.consumer2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Producer producer;
    @GetMapping("/producing")
    public String msg(@RequestParam String msg){
        producer.produce(msg);
        return msg;
    }
}
