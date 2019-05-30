package com.fehead.carpool.serviceImpl;

import com.fehead.carpool.dao.MessagesRepository;
import com.fehead.carpool.entity.db.Messages;
import com.fehead.carpool.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Nightnessss 2019/5/30 21:17
 */
@Service
public class CharRoomServiceImpl implements ChatRoomService {

    @Autowired
    private MessagesRepository messagesRepository;

    @Override
    public Messages save(Messages messages) {
        System.out.println("service:" + messages.toString());
        return messagesRepository.save(messages);
    }
}
