package com.example.feign.client.person.service.called;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCls {
    @Autowired
    Student student;
    @GetMapping("/person")
    public String dis(@RequestParam String name){
        String u=student.show(name);
        return u;
    }

}
