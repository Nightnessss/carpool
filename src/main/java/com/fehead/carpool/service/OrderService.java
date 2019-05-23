package com.fehead.carpool.service;

import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;

import java.util.List;

/**
 * @author Nightnessss 2019/5/17 20:33
 */
public interface OrderService {
    public List<OrderList> getAllOrders();

    public void creatOrder();

}
