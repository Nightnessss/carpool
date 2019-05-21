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
    private int id;
    @Column(name = "user_id")
    private int userId;
}
