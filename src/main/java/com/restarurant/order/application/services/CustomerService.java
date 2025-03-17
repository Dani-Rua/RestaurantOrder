package com.restarurant.order.application.services;

import com.restarurant.order.domain.entities.Customer;

import java.util.Optional;

public interface CustomerService {

    Optional<Customer> createNewCustomer(Customer customer);
}
