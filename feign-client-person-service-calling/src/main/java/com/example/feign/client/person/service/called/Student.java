package com.example.feign.client.person.service.called;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="feign-client-student-service-called",url="http://localhost:8080")
public interface Student {
    @GetMapping("/student")
    public String show(@RequestParam String name);

}
