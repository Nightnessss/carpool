package com.fehead.carpool.entity.db;

import javax.persistence.*;

/**
 * @author Nightnessss 2019/5/21 21:48
 */
@Entity
@Table(name = "user_order")
public class UserAndOrder {
    @Id
    @GeneratedValue
    @Column(name = "user_order_id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "order_id")
    private Integer orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

}
