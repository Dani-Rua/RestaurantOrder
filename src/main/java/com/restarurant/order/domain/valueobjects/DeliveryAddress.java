package com.restarurant.order.domain.valueobjects;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "deliveryAddress")
public class DeliveryAddress {

    private String street;
    private String city;
}
