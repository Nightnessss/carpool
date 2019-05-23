package com.fehead.carpool.entity.db;

import javax.persistence.*;
import javax.validation.constraints.Min;

/**
 * @author Nightnessss 2019/5/22 17:33
 */
@Entity
@Table
public class Score {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "number")
    private Integer number;
    @Column(name = "score")
    private double score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
