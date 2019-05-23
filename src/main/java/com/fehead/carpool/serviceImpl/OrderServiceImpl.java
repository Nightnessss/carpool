package com.fehead.carpool.serviceImpl;

import com.fehead.carpool.dao.AddressRepository;
import com.fehead.carpool.dao.OrderRepository;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nightnessss 2019/5/17 20:32
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public List<OrderList> getAllOrders(){
        List<Orders> list = orderRepository.findAll();
        List<OrderList> orderList = new ArrayList<>();
        for(Orders o:list){
            OrderList order =convertFromDO(o);
            order.setStartingName(addressRepository.findById(o.getStartingPointId().toString()).get().getAddressName());
            order.setEndingName(addressRepository.findById(o.getEndingPointId().toString()).get().getAddressName());
        }
        return orderList;
    }

    @Override
    public void creatOrder() {

    }
    public OrderList convertFromDO(Orders orders){
        OrderList orderList = new OrderList();
        BeanUtils.copyProperties(orders, orderList);
        return orderList;

    }

}
