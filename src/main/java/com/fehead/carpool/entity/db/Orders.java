package com.fehead.carpool.entity.db;


import com.fehead.carpool.idworker.IdWorker;
import com.fehead.carpool.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Nightnessss 2019/5/17 20:06
 */
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "order_num")
    private String orderNum;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "starting_point_id")
    private Integer startingPointId;
    @Column(name = "ending_point_id")
    private Integer endingPointId;
    @Column(name = "departure_time")
    private Timestamp departureTime;
    @Column(name = "time_tolerance")
    private Integer timeTolerance;
    // 已有成员人数
    @Column(name = "already_number")
    private Integer alreadyNumber;
    // 最多成员人数
    @Column(name = "max_number")
    private Integer maxNumber;
    // 备注
    @Column(name = "note")
    private String note;
    // 约单状态（1.等待2.进行3.结束）
    @Column(name = "status")
    private Integer status;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStartingPointId() {
        return startingPointId;
    }

    public void setStartingPointId(Integer startingPointId) {
        this.startingPointId = startingPointId;
    }

    public Integer getEndingPointId() {
        return endingPointId;
    }

    public void setEndingPointId(Integer endingPointId) {
        this.endingPointId = endingPointId;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getTimeTolerance() {
        return timeTolerance;
    }

    public void setTimeTolerance(Integer timeTolerance) {
        this.timeTolerance = timeTolerance;
    }

    public Integer getAlreadyNumber() {
        return alreadyNumber;
    }

    public void setAlreadyNumber(Integer alreadyNumber) {
        this.alreadyNumber = alreadyNumber;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
