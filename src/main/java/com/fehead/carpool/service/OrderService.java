package com.fehead.carpool.service;

import com.fehead.carpool.entity.db.Orders;

import java.util.List;

/**
 * @author Nightnessss 2019/5/17 20:33
 */
public interface OrderService {
    List<Orders> findAll();
}
