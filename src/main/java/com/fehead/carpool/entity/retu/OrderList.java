package com.fehead.carpool.entity.retu;

import java.sql.Timestamp;

/**
 * @author Nightnessss 2019/5/17 22:25
 */
public class OrderList {
    private Integer orderNum;
    private String userId;
    private String startingName;
    private String endingName;
    private Integer alreadyNumber;
    private Timestamp departureTime;

    public Integer getOrderId() {
        return orderNum;
    }

    public void setOrderId(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStartingName() {
        return startingName;
    }

    public void setStartingName(String startingName) {
        this.startingName = startingName;
    }

    public String getEndingName() {
        return endingName;
    }

    public void setEndingName(String endingName) {
        this.endingName = endingName;
    }

    public Integer getAlreadyNumber() {
        return alreadyNumber;
    }

    public void setAlreadyNumber(Integer alreadyNumber) {
        this.alreadyNumber = alreadyNumber;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }
}
