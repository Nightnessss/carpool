package com.fehead.carpool.entity.retu;

import java.sql.Timestamp;

/**
 * @author Nightnessss 2019/5/17 22:25
 */
public class OrderList {
    private Integer orderId;
    private String orderNum;
    private String userName;
    private String startingName;
    private String endingName;
    private Integer alreadyNumber;
    private String departureTime;

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    private double avgScore;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public OrderList() {
    }

    public OrderList(Integer orderId, String orderNum, String userName, String startingName, String endingName, Integer alreadyNumber, String departureTime, double avgScore) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.userName = userName;
        this.startingName = startingName;
        this.endingName = endingName;
        this.alreadyNumber = alreadyNumber;
        this.departureTime = departureTime;
        this.avgScore = avgScore;
    }
}
