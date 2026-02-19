package com.example.jms.producer.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    private final JmsTemplate jmsTemplate;
    Producer(JmsTemplate jmsTemplate){
        this. jmsTemplate= jmsTemplate;
    }

    public void producer(String msg){
        jmsTemplate.convertAndSend("queue",msg);
        System.out.println("sent");

    }

}
