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
    private Integer userId;
    @Column(name = "wx_id")
    private Integer wxId;
    @Column(name = "score_id")
    private Integer scoreId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWxId() {
        return wxId;
    }

    public void setWxId(Integer wxId) {
        this.wxId = wxId;
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }
}
