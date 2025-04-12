package com.npci.productservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {

    @Id
    private Long id;
    private String category;
    private String catGroup;
}
