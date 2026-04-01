package com.example.jms.producer.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "queue")
    public void consumer(String msg){
        System.out.println(msg);
    }
}
