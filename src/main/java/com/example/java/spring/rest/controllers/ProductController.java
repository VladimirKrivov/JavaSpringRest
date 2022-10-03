package com.example.java.spring.rest.controllers;

import com.example.java.spring.rest.services.service.ProductService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}