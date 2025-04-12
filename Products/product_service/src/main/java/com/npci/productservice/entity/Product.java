package com.npci.productservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @NotEmpty
    @NotNull
    private String name;

    @Positive
//    @Min(value = 10, message = "Please dont add any product with price lesser than 10")
//    @Max(value = 1000, message = "This platform doesnt allow high priced products.  Prices must be <= 1000 ")
    private Double price;

    @Column(name = "descr")
    private String description;

}
