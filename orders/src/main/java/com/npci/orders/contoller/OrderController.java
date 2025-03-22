package com.npci.orders.contoller;

import com.npci.orders.dto.OrderRequest;
import com.npci.orders.dto.OrderResponse;
import com.npci.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @PostMapping("/placeOrder")
    public OrderResponse placeOrder(@RequestBody OrderRequest orderRequest){

        return orderService.placeOrder(orderRequest);
    }

    @GetMapping("/callgreetings/{name}")
    public String callGreeting(@PathVariable String name){
        return orderService.callGreeting(name);
    }


}
