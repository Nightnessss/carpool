package com.fehead.carpool;

import com.fehead.carpool.dao.OrderRepository;
import com.fehead.carpool.entity.db.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarpoolApplicationTests {

	@Autowired
	private OrderRepository orderRepository;

	@Test
	public void contextLoads() {
		Orders o = new Orders();
		o.setOrderId(1000);
		orderRepository.save(o);
	}

}
