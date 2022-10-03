package com.example.java.spring.rest.services;

import com.example.java.spring.rest.entitys.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
