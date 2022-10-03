package com.example.java.spring.rest.services.service;

import com.example.java.spring.rest.services.ProductCartRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductCartService {
    private final ProductCartRepository productCartRepo;

    public ProductCartService(ProductCartRepository productCartRepo) {
        this.productCartRepo = productCartRepo;
    }
}
