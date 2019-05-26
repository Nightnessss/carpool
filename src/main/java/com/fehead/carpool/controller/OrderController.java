package com.fehead.carpool.controller;

import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.response.CommonReturnType;
import com.fehead.carpool.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
        List<OrderList> list = orderService.getAllOrderLists();
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
    @RequestMapping(value = "/createOrder", method = RequestMethod.POST)
    public CommonReturnType createOrder(@RequestParam("user_id") Integer userId,
                            @RequestParam("starting_latitude") double startingLatitude,
                            @RequestParam("starting_longitude") double startingLongitude,
                            @RequestParam("starting_address") String startingAddress,
                            @RequestParam("ending_latitude") double endingLatitude,
                            @RequestParam("ending_longitude") double endingLongitude,
                            @RequestParam("ending_address") String endingAddress,
                            @RequestParam("departure_time") Timestamp departureTime,
                            @RequestParam("time_tolerance") Integer timeTolerance,
                            @RequestParam("already_number") Integer alreadyNumber,
                            @RequestParam("max_number") Integer maxNumber,
                            @RequestParam("note") String note,
                            @RequestParam("status") Integer status) {
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
    public CommonReturnType findOrdersByCreatorUserId(@RequestParam("user_id") Integer userId) {

        return CommonReturnType.create(orderService.findOrderListsByCreatorUserId(userId));
    }

    /**
     * 根据用户id查找所有加入的约单（非创建）
     * @param userId
     * @return List<OrderList>
     */
    @RequestMapping("/findAttendOrdersByUserId")
    public CommonReturnType findAttendOrdersByUserId(@RequestParam("user_id") Integer userId) {

        return CommonReturnType.create(orderService.findAttendOrderListsByUserId(userId));
    }

    /**
     * 根据约单id查找约单
     * @param orderId
     * @return OrderInfo
     */
    @RequestMapping("/findOrderInfoById")
    public CommonReturnType findOrderById(@RequestParam("order_id") Integer orderId) {

        return CommonReturnType.create(orderService.findOrderInfoById(orderId));
    }

    /**
     * 根据约单id查找Orders
     * @param orderId
     * @return Orders
     */
    @RequestMapping("/findOrdersById")
    public Orders findOrdersById(@RequestParam("order_id") Integer orderId) {

        return orderService.findOrdersById(orderId);
    }

    /**
     * 根据约单号找约单id
     * @param orderNum
     * @return Integer
     */
    @RequestMapping("/findIdByOrderNum")
    public CommonReturnType findIdByOrderNum(@RequestParam("order_num") String orderNum) {

        return CommonReturnType.create(orderService.findIdByOrderNum(orderNum));
    }

    /**
     * 设置约单状态
     * @param orderId
     * @param status
     * @return void
     */
    @RequestMapping("/setStatus")
    public CommonReturnType setStatus(@RequestParam("order_id") Integer orderId, @RequestParam("status") Integer status) {

        orderService.setStatus(orderId, status);

        return CommonReturnType.create(null);
    }


}
