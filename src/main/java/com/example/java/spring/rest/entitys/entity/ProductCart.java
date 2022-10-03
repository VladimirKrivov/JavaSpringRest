package com.example.java.spring.rest.entitys.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_cart")
public class ProductCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "prod_count")
    private Integer productCount;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product products;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore
    Order orders;

}
