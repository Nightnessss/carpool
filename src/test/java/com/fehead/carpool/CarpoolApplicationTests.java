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
		List<OrderList> list = orderService.getAllOrders();
		Optional<Address> address = addressRepository.findById(2);
		System.out.println("+" + list);
	}

}
