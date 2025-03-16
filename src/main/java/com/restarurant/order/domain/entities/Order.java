package com.restarurant.order.domain.entities;


import com.restarurant.order.domain.enums.OrderStatus;
import com.restarurant.order.domain.valueobjects.DeliveryAddress;
import com.restarurant.order.domain.valueobjects.OrderAmountTotal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "orders")
public class Order {

    private String orderId;
    private Customer customer;
    private List<OrderItem> orderItems;
    private DeliveryAddress deliveryAddress;
    private OrderAmountTotal orderAmount;
    private OrderStatus orderStatus;
}
