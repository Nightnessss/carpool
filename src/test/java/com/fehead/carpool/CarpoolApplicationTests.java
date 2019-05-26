package com.fehead.carpool;

import com.fehead.carpool.dao.AddressRepository;
import com.fehead.carpool.dao.OrderRepository;
import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.service.OrderService;
import com.fehead.carpool.util.TimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarpoolApplicationTests {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderService orderService;
	@Autowired
	private AddressRepository addressRepository;
	@Test
	public void createTest() {
		Address starting = new Address(20, 30, "a");
		Address ending = new Address(12, 13, "b");
		Timestamp departureTime = new Timestamp(new Date().getTime());
		Orders orders = new Orders(1, departureTime, 30,
				1, 5, "none", 1);
		System.out.println(orderService.createOrder(orders, starting, ending));
	}

	@Test
	public void selectTest() {
		List<OrderList> orderLists = orderService.findOrderListsByCreatorUserId(1);
		for (OrderList orderList : orderLists) {
			System.out.println(orderList.toString());
		}

	}

	@Test
	public void updateTest() {
		orderService.setStatus(1, 3);
	}
	@Test
	public void test() {
		Timestamp departureTime = new Timestamp(new Date().getTime());
		System.out.println(TimeUtil.timestampToString(departureTime));
	}

}
