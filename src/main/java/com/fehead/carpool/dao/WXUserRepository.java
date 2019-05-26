package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.WXUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

/**
 * @author Nightnessss 2019/5/26 13:39
 */
@Repository
public interface WXUserRepository extends JpaRepository<WXUsers, Integer>{

}
