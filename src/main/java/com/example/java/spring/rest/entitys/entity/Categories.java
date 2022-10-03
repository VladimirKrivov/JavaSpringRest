package com.example.java.spring.rest.entitys.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_title")
    private String title;
    @Column(name = "category_desc")
    private String description;
}
