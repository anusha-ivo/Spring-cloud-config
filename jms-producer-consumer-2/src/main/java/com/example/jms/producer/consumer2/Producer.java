package com.example.jms.producer.consumer2;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component

public class Producer {
    private final JmsTemplate jmsTemplate;

    public Producer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void produce(String msg){
        jmsTemplate.convertAndSend("batc",msg);
        System.out.println("sent");


    }

}
