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

    /**
     * 首页
     * 获取所有约单数据
     * @return List<OrderList>
     */
    @RequestMapping("/index")
    public CommonReturnType getAllOrders() {
        List<OrderList> list = orderService.getAllOrders();
        return CommonReturnType.create(list);
    }

    /**
     * 创建约单
     * @param userId
     * @param startingLatitude
     * @param startingLongitude
     * @param startingAddress
     * @param endingLatitude
     * @param endingLongitude
     * @param endingAddress
     * @param departureTime
     * @param timeTolerance
     * @param alreadyNumber
     * @param maxNumber
     * @param note
     * @param status
     * @return Orders
     */
    @RequestMapping("/createOrder")
    public CommonReturnType createOrder(@Param("user_id") Integer userId,
                            @Param("starting_latitude") double startingLatitude,
                            @Param("starting_longitude") double startingLongitude,
                            @Param("starting_address") String startingAddress,
                            @Param("ending_latitude") double endingLatitude,
                            @Param("ending_longitude") double endingLongitude,
                            @Param("ending_address") String endingAddress,
                            @Param("departure_time") Timestamp departureTime,
                            @Param("time_tolerance") Integer timeTolerance,
                            @Param("already_number") Integer alreadyNumber,
                            @Param("max_number") Integer maxNumber,
                            @Param("note") String note,
                            @Param("status") Integer status) {
        Address starting = new Address(startingLongitude, startingLatitude, startingAddress);
        Address ending = new Address(endingLongitude, endingLatitude, endingAddress);
        Orders orders = new Orders(userId, departureTime, timeTolerance,
                alreadyNumber, maxNumber, note, status);

        return CommonReturnType.create(orderService.createOrder(orders, starting, ending));
    }

    /**
     * 根据创建者id查找约单
     * @param userId
     * @return List<OrderList>
     */
    @RequestMapping("/findOrdersByCreatorUserId")
    public CommonReturnType findOrdersByCreatorUserId(@Param("user_id") Integer userId) {

        return CommonReturnType.create(orderService.findOrdersByCreatorUserId(userId));
    }

    /**
     * 根据用户id查找所有加入的约单（非创建）
     * @param userId
     * @return List<OrderList>
     */
    @RequestMapping("/findAttendOrdersByUserId")
    public CommonReturnType findAttendOrdersByUserId(@Param("user_id") Integer userId) {

        return CommonReturnType.create(orderService.findAttendOrdersByUserId(userId));
    }

    /**
     * 根据约单id查找约单
     * @param orderId
     * @return OrderInfo
     */
    @RequestMapping("/findOrderById")
    public CommonReturnType findOrderById(@Param("order_id") Integer orderId) {

        return CommonReturnType.create(orderService.findOrderById(orderId));
    }
}
