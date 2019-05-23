package com.fehead.carpool.service;

import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderInfo;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.response.CommonReturnType;

import java.util.List;

/**
 * @author Nightnessss 2019/5/17 20:33
 */
public interface OrderService {

    public List<OrderList> getAllOrders();


    public Orders createOrder(Orders orders, Address starting, Address ending);


    public List<OrderList> findOrdersByCreatorUserId(Integer userId);


    public List<OrderList> findAttendOrdersByUserId(Integer userId);


    public OrderInfo findOrderById(Integer orderId);

}
