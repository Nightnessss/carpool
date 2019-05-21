package com.fehead.carpool.entity.db;

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
    private int orderId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "starting_point_id")
    private int startingPointId;
    @Column(name = "ending_point_id")
    private int endingPointId;
    @Column(name = "departure_time")
    private Timestamp departureTime;
    @Column(name = "time_tolerance")
    private int timeTolerance;
    @Column(name = "already_number")
    private int alreadyNumber;
    @Column(name = "max_number")
    private int maxNumber;
    @Column(name = "note")
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
