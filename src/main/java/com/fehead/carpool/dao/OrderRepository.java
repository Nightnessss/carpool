package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Nightnessss 2019/5/17 20:29
 */
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{

    List<Orders> findByUserId (Integer userId);
}
