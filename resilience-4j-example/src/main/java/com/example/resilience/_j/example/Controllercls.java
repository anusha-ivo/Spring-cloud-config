package com.example.resilience._j.example;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllercls {
    int c=0;
    @CircuitBreaker(name="demoService", fallbackMethod="fallback")
    @GetMapping("/4j")
     public String show(){
         c++;
         if(c<=5){
             throw new RuntimeException("error happens");
         }
         else{
             return "hi from 4j";
         }

     }
     public String fallback(Exception e){
        return "try again more load to service";
     }


}
