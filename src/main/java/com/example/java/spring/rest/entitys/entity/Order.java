package com.example.java.spring.rest.entitys.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "order_user_name")
    private String firstName;
    @Column(name = "order_phone")
    private String phoneNumber;
    @Column(name = "order_delivery_type")
    private String delivery;
    @Column(name = "order_city")
    private String city;
    @Column(name = "order_street")
    private String street;
    @Column(name = "order_house_number")
    private String house;
    @Column(name = "order_person_count")
    private String person;
    @Column(name = "order_other")
    private String other;
}
