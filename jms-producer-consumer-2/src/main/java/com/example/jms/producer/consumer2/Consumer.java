package com.example.jms.producer.consumer2;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "batc")
    public void consume(String msg){
        System.out.println(msg);

    }

}
