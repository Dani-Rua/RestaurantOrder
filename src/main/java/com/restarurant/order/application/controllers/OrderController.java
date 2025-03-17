package com.restarurant.order.application.controllers;


import com.restarurant.order.application.services.OrderService;
import com.restarurant.order.application.services.impl.OrderServiceImpl;
import com.restarurant.order.domain.entities.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/save")
    public ResponseEntity<Order> createOrder(@RequestBody Order request) {
        return orderService.createNewOrder(request)
                .map(order -> ResponseEntity.ok().body(order))
                .orElse(ResponseEntity.badRequest().build());
    }

    @PutMapping("/update")
    public String updateOrder(){
        return "Se ha actualizado una orden";
    }
}
