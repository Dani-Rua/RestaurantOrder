package com.restarurant.order.application.services.impl;

import com.restarurant.order.application.services.OrderService;
import com.restarurant.order.domain.entities.Order;
import com.restarurant.order.domain.entities.OrderItem;
import com.restarurant.order.domain.repositories.OrderRepository;
import com.restarurant.order.domain.valueobjects.OrderAmountTotal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Optional<Order> createNewOrder(Order order) {
        if (order == null || order.getOrderItems() == null || order.getOrderItems().isEmpty()){
            return Optional.empty();
        }

        double total = order.getOrderItems()
                .stream()
                .mapToDouble(OrderItem::calculateTotal)
                .sum();

        if (order.getCustomer() == null) {
            return Optional.empty();
        }

        order = Order.builder()
                .orderId(order.getOrderId())
                .customer(order.getCustomer())
                .orderItems(order.getOrderItems())
                .deliveryAddress(order.getDeliveryAddress())
                .orderStatus(order.getOrderStatus())
                .orderAmount(new OrderAmountTotal(total))
                .build();


        return Optional.ofNullable(order)
                .map(orderRepository::save);
    }
}
