package com.example.feign.client.student.service.called;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlercls {
    @GetMapping("/student")
    public String show(@RequestParam String name){
        return  "name of student is "+ name;
    }

}
