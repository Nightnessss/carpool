package com.fehead.carpool.entity.db;

import javax.persistence.*;

/**
 * @author Nightnessss 2019/5/17 22:55
 */
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "address_name")
    private String addressName;

    public Address(double longitude, double latitude, String addressName) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.addressName = addressName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", addressName='" + addressName + '\'' +
                '}';
    }
}
