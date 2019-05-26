package com.fehead.carpool.entity.retu;

import java.sql.Timestamp;

/**
 * @author Nightnessss 2019/5/23 21:09
 */
public class OrderInfo {
    private Integer orderId;
    private String orderNum;
    private String nickName;
    private String startingAddress;
    private String endingAddress;
    private String departureTime;
    private Integer timeTolerance;
    private Integer alreadyNumber;
    private Integer maxNumber;
    private String note;
    private Integer status;
    private double score;
    private Integer scoreNumber;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStartingAddress() {
        return startingAddress;
    }

    public void setStartingAddress(String startingAddress) {
        this.startingAddress = startingAddress;
    }

    public String getEndingAddress() {
        return endingAddress;
    }

    public void setEndingAddress(String endingAddress) {
        this.endingAddress = endingAddress;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Integer getScoreNumber() {
        return scoreNumber;
    }

    public void setScoreNumber(Integer scoreNumber) {
        this.scoreNumber = scoreNumber;
    }
}
