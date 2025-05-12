package com.restarurant.order.application.services.impl;

import com.restarurant.order.application.services.IOrderPublisherService;
import com.restarurant.order.infractructure.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;



public class OrderPublisherImpl implements IOrderPublisherService {

    private final RabbitTemplate rabbitTamplate;

    public OrderPublisherImpl(RabbitTemplate rabbitTamplate) {
        this.rabbitTamplate = rabbitTamplate;
    }

    @Override
    public void publish(String message) {
        rabbitTamplate.convertAndSend(
                RabbitConfig.EXCHANGE,
                RabbitConfig.ROUTING,
                message
        );
    }
}
