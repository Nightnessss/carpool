package com.fehead.carpool.service;

import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.response.CommonReturnType;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Nightnessss 2019/5/17 20:33
 */
public interface OrderService {
    @PostMapping("/order/")
    public List<OrderList> getAllOrders();

    @PostMapping("/order/")
    public CommonReturnType createOrder(Orders orders, Address starting, Address ending);

    @PostMapping("/order/")
    public CommonReturnType findOrdersByCreatorUserId(Integer UserId);

    @PostMapping("/order/")
    public CommonReturnType findAttendOrdersByUserId(Integer UserId);

    @PostMapping("/order/")
    public CommonReturnType findOrderById(Integer orderId);

}
