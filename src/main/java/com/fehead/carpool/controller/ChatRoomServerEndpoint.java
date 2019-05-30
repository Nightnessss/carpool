package com.fehead.carpool.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fehead.carpool.entity.db.Messages;
import com.fehead.carpool.service.ChatRoomService;
import com.fehead.carpool.serviceImpl.CharRoomServiceImpl;
import com.fehead.carpool.utils.JsonUtils;
import com.fehead.carpool.utils.WebSocketUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

import static com.fehead.carpool.utils.WebSocketUtils.sendMessageAll;

/**
 * @author Nightnessss 2019/5/27 21:02
 */
@RestController
@ServerEndpoint("/chat/{room_id}/{user_id}")
public class ChatRoomServerEndpoint {


    private static final Logger log = LoggerFactory.getLogger(ChatRoomServerEndpoint.class);

    @OnOpen
    public void openSession(@PathParam("room_id") Integer roomId, @PathParam("user_id") Integer userId, Session session) {
//        WebSocketUtils.CHAT.put(username, session);
//        WebSocketUtils.CHAT_ROOM.put(roomId, WebSocketUtils.CHAT);
        WebSocketUtils.getROOM(roomId).put(userId, session);
        String message = "欢迎 " + userId + " 加入群聊！";
        log.info(message);
        sendMessageAll(roomId, message);

    }

    @OnMessage
    public void onMessage(@PathParam("room_id") Integer roomId, String msg) throws IOException {

        Messages messages = JsonUtils.jsonToObject(msg, Messages.class);
        log.info(messages.toString());
        messages.setRoomId(roomId);
        ChatRoomService chatRoomService = new CharRoomServiceImpl();
        Messages message = chatRoomService.save(messages);
        try {
            sendMessageAll(roomId, JsonUtils.objectToJson(message));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @OnClose
    public void onClose(@PathParam("room_id") Integer roomId, @PathParam("user_id") Integer userId, Session session) {
        //当前的Session 移除
        WebSocketUtils.CHATS.get(roomId).remove(userId);
        //并且通知其他人当前用户已经离开聊天室了
        sendMessageAll(roomId, userId + " 退出群聊！");
        try {
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        try {
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throwable.printStackTrace();
    }



//    @GetMapping("/chat-room/{sender}/to/{receive}")
//    public void onMessage(@PathVariable("sender") String sender, @PathVariable("receive") String receive, String message) {
//        WebSocketUtils.sendMessage(WebSocketUtils.LIVING_SESSIONS_CACHE.get(receive), "[" + sender + "]" + "-> [" + receive + "] : " + message);
//    }

}
