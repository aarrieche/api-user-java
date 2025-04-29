package com.example.demo.event;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NewUserEventListener {

    @RabbitListener(queues = RabbitMQConfig.USER_QUEUE)
    public void newUser(NewUserEvent event) {
        
    }
}