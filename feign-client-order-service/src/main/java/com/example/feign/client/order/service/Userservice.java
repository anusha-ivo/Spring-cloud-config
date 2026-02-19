package com.example.feign.client.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="feign-client-user-service-called",url="http://localhost:8080")
public interface Userservice {
    @GetMapping("/user/{id}")
    public String show(@PathVariable String id);

}
