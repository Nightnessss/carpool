package com.fehead.carpool.entity.db;

import javax.persistence.*;

/**
 * @author Nightnessss 2019/5/17 23:06
 */
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int userId;
    @Column(name = "wx_id")
    private int wxId;


}
