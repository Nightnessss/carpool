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
    private Integer wxId;
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

    public Integer getWxId() {
        return wxId;
    }

    public void setWxId(Integer wxId) {
        this.wxId = wxId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
