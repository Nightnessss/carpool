package com.fehead.carpool;

import com.fehead.carpool.dao.AddressRepository;
import com.fehead.carpool.dao.OrderRepository;
import com.fehead.carpool.entity.db.Address;
import com.fehead.carpool.entity.db.Orders;
import com.fehead.carpool.entity.retu.OrderList;
import com.fehead.carpool.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
	public void contextLoads() {
		Address starting = new Address(20, 30, "a");
		Address ending = new Address(12, 13, "b");
		Timestamp departureTime = new Timestamp(new Date().getTime());
		Orders orders = new Orders(1, departureTime, 30,
				1, 5, "none", 1);
		System.out.println(orderService.createOrder(orders, starting, ending));
	}

}
