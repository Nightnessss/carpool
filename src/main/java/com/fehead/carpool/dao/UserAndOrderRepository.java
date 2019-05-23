package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.UserAndOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Nightnessss 2019/5/23 21:42
 */
@Repository
public interface UserAndOrderRepository extends JpaRepository<UserAndOrder, Integer> {

    List<UserAndOrder> findByUserId (Integer userId);
}
