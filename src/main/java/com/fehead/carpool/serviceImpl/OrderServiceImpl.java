package com.fehead.carpool.serviceImpl;

import com.fehead.carpool.dao.AddressRepository;
import com.fehead.carpool.dao.OrderRepository;
import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.idworker.Sid;
import com.fehead.carpool.response.CommonReturnType;
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

    @Autowired
    private Sid sid;

    /**
     * 获取所有约单
     * @return
     */
    @Override
    public List<OrderList> getAllOrders(){
        List<Orders> list = orderRepository.findAll();
        List<OrderList> orderList = new ArrayList<>();
        for(Orders o:list){
            OrderList order =convertFromDO(o);

            order.setStartingName(addressRepository.findById(o.getStartingPointId()).get().getAddressName());
            order.setEndingName(addressRepository.findById(o.getEndingPointId()).get().getAddressName());
            orderList.add(order);
        }
        return orderList;
    }

    @Override
    public CommonReturnType createOrder(Orders orders, Address starting, Address ending) {

        Integer startingId = addressRepository.save(starting).getId();
        Integer endingId = addressRepository.save(ending).getId();
        orders.setStartingPointId(startingId);
        orders.setEndingPointId(endingId);
        // 随机生成约单号
        orders.setOrderNum(sid.nextShort());

        orderRepository.save(orders);

        return CommonReturnType.create(orders);
    }

    @Override
    public CommonReturnType findOrdersByCreatorUserId(Integer UserId) {
        return null;
    }

    @Override
    public CommonReturnType findAttendOrdersByUserId(Integer UserId) {
        return null;
    }

    @Override
    public CommonReturnType findOrderById(Integer orderId) {
        return null;
    }

    public OrderList convertFromDO(Orders orders){
        OrderList orderList = new OrderList();
        BeanUtils.copyProperties(orders, orderList);
        return orderList;

    }

}
