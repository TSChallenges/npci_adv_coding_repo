package com.npci.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {

    private Long orderId;
    private Long productId;
    private Integer qty;
    private String productName;
    private Double totalPrice;

}
