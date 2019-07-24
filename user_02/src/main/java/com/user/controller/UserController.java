package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("/users")
    @ResponseBody
    public Map findUsers(){
        Map map = new HashMap();
        map.put("userId", "00002");
        map.put("name", "user_02");
        return map;
    }
}
