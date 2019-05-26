package com.fehead.carpool.entity.retu;

import java.sql.Timestamp;

/**
 * @author Nightnessss 2019/5/17 22:25
 */
public class OrderList {
    private String orderNum;
    private String userName;
    private String startingName;
    private String endingName;
    private Integer alreadyNumber;
    private String departureTime;

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

    @Override
    public String toString() {
        return "OrderList{" +
                "orderNum='" + orderNum + '\'' +
                ", userName='" + userName +
                ", startingName='" + startingName + '\'' +
                ", endingName='" + endingName + '\'' +
                ", alreadyNumber=" + alreadyNumber +
                ", departureTime=" + departureTime +
                '}';
    }
}
