package com.fehead.carpool.entity.model;

import javax.persistence.Column;
import java.sql.Timestamp;

/**
 * @author Nightnessss 2019/5/17 22:18
 */
public class Order {

    private int orderId;
    private int userId;
    private int startingPointId;
    private int endingPointId;
    private Timestamp departureTime;
    private int timeTolerance;
    private int alreadyNumber;
    private int maxNumber;
    private String note;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStartingPointId() {
        return startingPointId;
    }

    public void setStartingPointId(int startingPointId) {
        this.startingPointId = startingPointId;
    }

    public int getEndingPointId() {
        return endingPointId;
    }

    public void setEndingPointId(int endingPointId) {
        this.endingPointId = endingPointId;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public int getTimeTolerance() {
        return timeTolerance;
    }

    public void setTimeTolerance(int timeTolerance) {
        this.timeTolerance = timeTolerance;
    }

    public int getAlreadyNumber() {
        return alreadyNumber;
    }

    public void setAlreadyNumber(int alreadyNumber) {
        this.alreadyNumber = alreadyNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
