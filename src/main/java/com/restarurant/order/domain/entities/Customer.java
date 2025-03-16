package com.restarurant.order.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "customers")

public class Customer {

    @Id
    private String customerId;
    private String username;
    private String email;
}
