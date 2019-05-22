package com.fehead.carpool.serviceImpl;

import com.fehead.carpool.dao.OrderRepository;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nightnessss 2019/5/17 20:32
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Orders> getAllOrders(){
        List<Orders> list = orderRepository.findAll();
        return null;
    }

    @Override
    public void creatOrder() {

    }

}
