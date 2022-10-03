package com.example.java.spring.rest.services;

import com.example.java.spring.rest.entitys.entity.ProductCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCartRepository extends CrudRepository<ProductCart, Long> {
}
