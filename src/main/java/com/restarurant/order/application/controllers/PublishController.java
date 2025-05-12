package com.restarurant.order.application.controllers;


import com.restarurant.order.application.services.impl.OrderPublisherImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publishers")

public class PublishController {

    private final OrderPublisherImpl publisher;

    public PublishController(OrderPublisherImpl publisher) {
        this.publisher = publisher;
    }

    @PostMapping
    public ResponseEntity<String> send(@RequestBody String payload) {
        publisher.publish(payload);
        return ResponseEntity.accepted().build();
    }
}
