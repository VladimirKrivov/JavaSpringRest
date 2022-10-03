package com.example.java.spring.rest.controllers;

import com.example.java.spring.rest.services.service.CategoriesService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {
    private final CategoriesService categoriesService;

    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }
}
