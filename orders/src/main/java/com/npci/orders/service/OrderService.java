package com.npci.orders.service;

import com.npci.orders.dto.OrderRequest;
import com.npci.orders.dto.OrderResponse;
import com.npci.orders.dto.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class OrderService {

    String GET_PROD_URL  = "http://localhost:8080/products/{id}";

    public OrderResponse placeOrder(OrderRequest orderRequest) {

        // 1. retrieve the product details from the product service
        Long prodId = orderRequest.getProductId();
        String url = GET_PROD_URL.replace("{id}", prodId.toString());
        System.out.println("URL  " + url);
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Product>  productResponseEntity = restTemplate.getForEntity(url, Product.class);
        Product  product = productResponseEntity.getBody();

        // 2. process the order

        Long orderId = new Random().nextLong();
        Double totalPrice = orderRequest.getQty() * product.getPrice();

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(orderId);
        orderResponse.setProductId(prodId);
        orderResponse.setTotalPrice(totalPrice);
        orderResponse.setQty(orderRequest.getQty());
        orderResponse.setProductName(product.getName());

        // 3. return the response
        return orderResponse;
    }
}
