package com.restarurant.order.application.services.impl;

import com.restarurant.order.application.services.OrderService;
import com.restarurant.order.domain.entities.Order;
import com.restarurant.order.domain.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Optional<Order> createNewOrder(Order order) {
        return Optional.ofNullable(order).map(orderRepository::save);
    }
}
