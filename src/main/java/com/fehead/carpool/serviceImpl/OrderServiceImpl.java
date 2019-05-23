package com.fehead.carpool.serviceImpl;

import com.fehead.carpool.dao.*;
import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.db.Score;
import com.fehead.carpool.entity.db.UserAndOrder;
import com.fehead.carpool.entity.retu.OrderInfo;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.idworker.Sid;
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
    private UserAndOrderRepository userAndOrderRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private Sid sid;

    /**
     * 获取所有约单
     * @return List<OrderList>
     */
    @Override
    public List<OrderList> getAllOrders(){
        List<Orders> ordersList = orderRepository.findAll();

        return ordersToOrderList(ordersList);
    }

    /**
     * 创建约单
     * @param orders
     * @param starting
     * @param ending
     * @return Orders
     */
    @Override
    public Orders createOrder(Orders orders, Address starting, Address ending) {

        Integer startingId = addressRepository.save(starting).getId();
        Integer endingId = addressRepository.save(ending).getId();
        orders.setStartingPointId(startingId);
        orders.setEndingPointId(endingId);
        // 随机生成约单号
        orders.setOrderNum(sid.nextShort());

        orderRepository.save(orders);

        return orders;
    }

    /**
     * 根据创建者id查找约单
     * @param userId
     * @return List<OrderList>
     */
    @Override
    public List<OrderList> findOrdersByCreatorUserId(Integer userId) {
        List<Orders> ordersList = orderRepository.findByUserId(userId);

        return ordersToOrderList(ordersList);
    }

    /**
     * 根据用户id查找所有加入的约单（非创建）
     * @param userId
     * @return List<OrderList>
     */
    @Override
    public List<OrderList> findAttendOrdersByUserId(Integer userId) {
        List<UserAndOrder> userAndOrderList = userAndOrderRepository.findByUserId(userId);

        return userAndOrderToOrderList(userAndOrderList);
    }

    /**
     * 根据约单id查找约单
     * @param orderId
     * @return OrderInfo
     */
    @Override
    public OrderInfo findOrderById(Integer orderId) {
        Orders orders = orderRepository.findById(orderId).get();

        return ordersToOrderInfo(orders);
    }

    /**
     * 将Orders中与OrderList相同的属性的值赋予OrderList
     * @param orders
     * @return orderList
     */
    public OrderList convertFromDO(Orders orders){
        OrderList orderList = new OrderList();
        BeanUtils.copyProperties(orders, orderList);
        return orderList;

    }

    /**
     * 将db层的Orders转换为view层的OrderList
     * @param ordersList
     * @return
     */
    public List<OrderList> ordersToOrderList(List<Orders> ordersList) {
        List<OrderList> orderLists = new ArrayList<>();
        for (Orders o : ordersList) {
            OrderList order = convertFromDO(o);
            order.setStartingName(addressRepository.findById(o.getStartingPointId()).get().getAddressName());
            order.setEndingName(addressRepository.findById(o.getEndingPointId()).get().getAddressName());
            orderLists.add(order);
        }

        return orderLists;
    }

    /**
     * 将db层的UserAndOrder转换为view层的OrderList
     * @param userAndOrderList
     * @return
     */
    public List<OrderList> userAndOrderToOrderList(List<UserAndOrder> userAndOrderList) {

        List<Orders> ordersList = new ArrayList<>();
        for (UserAndOrder uao : userAndOrderList) {
            ordersList.add(orderRepository.findById(uao.getId()).get());
        }
        List<OrderList> orderLists = ordersToOrderList(ordersList);
        return orderLists;
    }

    /**
     * 将db层的Orders转换为view层的OrderInfo
     * @param orders
     * @return
     */
    public OrderInfo ordersToOrderInfo(Orders orders) {
        OrderInfo orderInfo = new OrderInfo();
        BeanUtils.copyProperties(orders, orderInfo);
        orderInfo.setStartingAddress(addressRepository.findById(orders.getStartingPointId()).get().getAddressName());
        orderInfo.setEndingAddress(addressRepository.findById(orders.getEndingPointId()).get().getAddressName());

        Score score = scoreRepository.findById(usersRepository.findById(orders.getUserId()).get().getScoreId()).get();
        orderInfo.setScore(score.getScore());
        orderInfo.setScoreNumber(score.getNumber());

        return orderInfo;
    }

}
