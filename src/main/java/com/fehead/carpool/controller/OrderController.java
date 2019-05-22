package com.fehead.carpool.controller;

import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author Nightnessss 2019/5/17 19:59
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @RequestMapping("/index")
    public List<Orders> index() {
        List<Orders> list = orderService.getAllOrders();
        System.out.println("+" + list);
        return list;
    }

    @RequestMapping("/submitOrder")
    public void submitOrder(@Param("starting_latitude") double startingLatitude,
                            @Param("starting_longitude") double startingLongitude,
                            @Param("starting_address") String startingAddress,
                            @Param("ending_latitude") double endingLatitude,
                            @Param("ending_longitude") double endingLongitude,
                            @Param("ending_address") String endingingAddress,
                            @Param("departure_time") Timestamp departureTime,
                            @Param("time_tolerance") Integer timeTolerance,
                            @Param("already_number") Integer alreadyNumber,
                            @Param("max_number") Integer maxNumber,
                            @Param("note") String note) {


    }
}
