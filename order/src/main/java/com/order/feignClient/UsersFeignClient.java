package com.order.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Component
@FeignClient(value = "USERS")
public interface UsersFeignClient {

    @RequestMapping(value = "/users")
    public Map findUsers();
}
