package com.fehead.carpool.utils;

import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Nightnessss 2019/5/27 20:59
 */
public class WebSocketUtils {

    public static Map<Integer,Map<Integer, Session>> CHATS = new ConcurrentHashMap<>();

    public static Map<Integer, Session> getROOM(Integer roomId){
        Map<Integer, Session> room = CHATS.get(roomId);
        if(room==null){
            room = new ConcurrentHashMap<>();
            CHATS.put(roomId, room);
        }

        return room;
    }
    /**
     * 模拟存储 websocket session 使用
     */
//    public static final Map<String, Session> LIVING_SESSIONS_CACHE = new ConcurrentHashMap<>();

    public static void sendMessageAll(Integer roomId, String message) {
        CHATS.get(roomId).forEach((sessionId, session) -> sendMessage(session, message));
    }

    /**
     * 发送给指定用户消息
     *
     * @param session 用户 session
     * @param message 发送内容
     */
    public static void sendMessage(Session session, String message) {
        if (session == null) {
            return;
        }
        final RemoteEndpoint.Basic basic = session.getBasicRemote();
        if (basic == null) {
            return;
        }
        try {
            basic.sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
