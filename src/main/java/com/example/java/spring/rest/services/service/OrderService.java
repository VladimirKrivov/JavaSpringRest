package com.example.java.spring.rest.services.service;

import com.example.java.spring.rest.services.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
