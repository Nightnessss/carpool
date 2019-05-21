package com.fehead.carpool.controller;

import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nightnessss 2019/5/17 19:59
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @RequestMapping("/order")
    public List<Orders> showOrder() {
        List<Orders> list = orderService.findAll();
        System.out.println("+" + list);
        return orderService.findAll();
    }
}
