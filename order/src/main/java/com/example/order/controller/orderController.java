package com.example.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lifang on 2019/9/10 0010.
 */
@RestController
public class orderController {
    @RequestMapping("orderTest")
    public String orderTest(){
        return "this is order";
    }

}
