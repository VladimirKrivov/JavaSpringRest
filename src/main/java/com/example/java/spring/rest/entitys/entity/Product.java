package com.example.java.spring.rest.entitys.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "prod_title")
    private String title;
    @Column(name = "prod_description")
    private String description;
    @Column(name = "prod_price")
    private Double price;
    @Column(name = "prod_count")
    private Integer count;
}
