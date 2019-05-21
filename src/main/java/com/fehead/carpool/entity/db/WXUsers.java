package com.fehead.carpool.entity.db;

import javax.persistence.*;

/**
 * @author Nightnessss 2019/5/19 22:08
 */
@Entity
@Table(name = "wx_users")
public class WXUsers {
    @Id
    @GeneratedValue
    @Column(name = "wx_id")
    private int wxId;
    @Column(name = "open_id")
    private String openId;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "city")
    private String city;
    @Column(name = "union_id")
    private String unionId;
    @Column(name = "province")
    private String province;
    @Column(name = "country")
    private String country;
    @Column(name = "avatar_url")
    private String avatarUrl;
}
