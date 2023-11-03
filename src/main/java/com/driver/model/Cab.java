package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "cab")
public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cabId;
    private int perKmRate;
    private boolean availAble;
    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab() {
    }

    public Cab(int perKmRate, boolean availAble) {
        this.perKmRate = perKmRate;
        this.availAble = availAble;
    }
    public Integer getCabId() {
        return cabId;
    }
    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailAble() {
        return availAble;
    }

    public void setAvailAble(boolean availAble) {
        this.availAble = availAble;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}