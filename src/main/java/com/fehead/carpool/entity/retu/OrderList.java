package com.fehead.carpool.entity.retu;

import java.sql.Timestamp;

/**
 * @author Nightnessss 2019/5/17 22:25
 */
public class OrderList {
    private int orderId;
    private String initiator;
    private String starting_name;
    private String ending_name;
    private int already_number;
    private Timestamp departureTime;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getStarting_name() {
        return starting_name;
    }

    public void setStarting_name(String starting_name) {
        this.starting_name = starting_name;
    }

    public String getEnding_name() {
        return ending_name;
    }

    public void setEnding_name(String ending_name) {
        this.ending_name = ending_name;
    }

    public int getAlready_number() {
        return already_number;
    }

    public void setAlready_number(int already_number) {
        this.already_number = already_number;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "orderId=" + orderId +
                ", initiator='" + initiator + '\'' +
                ", starting_name='" + starting_name + '\'' +
                ", ending_name='" + ending_name + '\'' +
                ", already_number=" + already_number +
                ", departureTime=" + departureTime +
                '}';
    }
}
