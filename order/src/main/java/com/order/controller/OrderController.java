package com.order.controller;

import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getUsers")
    public String getUsers() {
        return orderService.createOrder();
    }

    @GetMapping("/getOrders")
    public String getOrders() {
        return orderService.getOrders();
    }

}
