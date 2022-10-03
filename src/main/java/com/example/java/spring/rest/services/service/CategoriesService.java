package com.example.java.spring.rest.services.service;

import com.example.java.spring.rest.services.CategoriesRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;

    public CategoriesService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }
}
