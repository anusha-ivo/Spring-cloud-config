package com.example.feign.client.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllercls {
    @Autowired
    Userservice userservice;
    @GetMapping("/order/{id}")
    public String dis(@PathVariable String id){
        String u=userservice.show(id);
        return  u;
    }

}
