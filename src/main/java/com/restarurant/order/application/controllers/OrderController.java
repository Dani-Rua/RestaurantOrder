package com.restarurant.order.application.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")

public class OrderController {

    @PostMapping("/save")
    public String getOrder(){
        return "Se ha creado una orden";
    }

    @PutMapping("/update")
    public String createOrder(){
        return "Se ha actualizado una orden";
    }
}
