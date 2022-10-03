package com.example.java.spring.rest.services;

import com.example.java.spring.rest.entitys.entity.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Long> {
}
