package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nightnessss 2019/5/23 22:38
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
