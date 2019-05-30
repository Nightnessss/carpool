package com.fehead.carpool.entity.db;

import javax.persistence.*;
import java.io.File;

/**
 * @author Nightnessss 2019/5/29 15:12
 */
@Entity
@Table(name = "Messages")
public class Messages {
    @Id
    @GeneratedValue
    @Column(name = "msg_id")
    private Integer msgId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "room_id")
    private Integer roomId;
    private String username;
    private String face;
    private String time;
    private String type;
    private String msg;
    private File pic;
    private File voice;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public File getPic() {
        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public File getVoice() {
        return voice;
    }

    public void setVoice(File voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "msgId=" + msgId +
                ", userId=" + userId +
                ", roomId=" + roomId +
                ", username='" + username + '\'' +
                ", face='" + face + '\'' +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", msg='" + msg + '\'' +
                ", pic=" + pic +
                ", voice=" + voice +
                '}';
    }
}
