package com.fehead.carpool.controller;

import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.response.CommonReturnType;
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
    public CommonReturnType index() {
        List<OrderList> list = orderService.getAllOrders();
        System.out.println("+" + list);
        return CommonReturnType.create(list);
    }

    @RequestMapping("/submitOrder")
    public void submitOrder(@Param("user_id") Integer userId,
                            @Param("starting_latitude") double startingLatitude,
                            @Param("starting_longitude") double startingLongitude,
                            @Param("starting_address") String startingAddress,
                            @Param("ending_latitude") double endingLatitude,
                            @Param("ending_longitude") double endingLongitude,
                            @Param("ending_address") String endingingAddress,
                            @Param("departure_time") Timestamp departureTime,
                            @Param("time_tolerance") Integer timeTolerance,
                            @Param("already_number") Integer alreadyNumber,
                            @Param("max_number") Integer maxNumber,
                            @Param("note") String note,
                            @Param("status") Integer status) {
        Address starting = new Address(startingLongitude, startingLatitude, startingAddress);
        Address ending = new Address(endingLongitude, endingLatitude, endingingAddress);
        Orders orders = new Orders(userId, departureTime, timeTolerance,
                alreadyNumber, maxNumber, note, status);
        orderService.createOrder(orders, starting, ending);


    }
}
