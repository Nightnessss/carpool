package com.fehead.carpool.service;

import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderInfo;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.response.CommonReturnType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Nightnessss 2019/5/17 20:33
 */
public interface OrderService {

    public List<OrderList> getAllOrderLists();


    public Orders createOrder(Orders orders, Address starting, Address ending);


    public List<OrderList> findOrderListsByCreatorUserId(Integer userId);


    public List<OrderList> findAttendOrderListsByUserId(Integer userId);


    public OrderInfo findOrderInfoById(Integer orderId);


    public Orders findOrdersById(Integer orderId);


    public Integer findIdByOrderNum(String OrderNum);


    public void setStatus(Integer orderId, Integer status);



}
