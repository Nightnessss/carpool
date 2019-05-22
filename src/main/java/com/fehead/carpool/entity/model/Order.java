package com.fehead.carpool.entity.model;

import javax.persistence.Column;
import java.sql.Timestamp;

/**
 * @author Nightnessss 2019/5/17 22:18
 */
public class Order {

    private Integer orderId;
    private Integer userId;
    private Integer startingPointId;
    private Integer endingPointId;
    private Timestamp departureTime;
    private Integer timeTolerance;
    private Integer alreadyNumber;
    private Integer maxNumber;
    private String note;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
}
