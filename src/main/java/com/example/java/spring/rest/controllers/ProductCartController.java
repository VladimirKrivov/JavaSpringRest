package com.example.java.spring.rest.controllers;

import com.example.java.spring.rest.services.service.ProductCartService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCartController {
    private final ProductCartService productCartService;

    public ProductCartController(ProductCartService productCartService) {
        this.productCartService = productCartService;
    }
}
