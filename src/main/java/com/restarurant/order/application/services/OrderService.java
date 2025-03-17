package com.restarurant.order.application.services;


import com.restarurant.order.domain.entities.Order;

import java.util.Optional;

public interface OrderService {

   Optional<Order> createNewOrder(Order order);
}
