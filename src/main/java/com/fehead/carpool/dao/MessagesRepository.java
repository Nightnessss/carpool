package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @author Nightnessss 2019/5/30 21:29
 */
@Repository
public interface MessagesRepository extends JpaRepository<Messages, Integer> {
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "select * from persons order by msg_id desc limit 1 where room_id = :roomId")
    Messages getMessages(Integer roomId);
}
