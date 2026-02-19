package com.example.feign.client.user.service.called;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controllercls {
    @GetMapping("user/{id}")
        public String show(@PathVariable String id){
            return  "with user id "+id;

        }

    }

