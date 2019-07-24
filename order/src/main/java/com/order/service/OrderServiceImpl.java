package com.order.service;

import com.order.feignClient.UsersFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UsersFeignClient usersFeignClient;

    @Override
    public String createOrder() {
        Map map = usersFeignClient.findUsers();

        return map.toString();
    }

    @Override
    public String getOrders() {

        return "order list: 1, 2, 3, 4, 5";
    }
}
