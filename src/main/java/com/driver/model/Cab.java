package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "cab")
public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cabId;
    private int perKmRate;
    private boolean available;
    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab() {
    }

    public Cab(int perKmRate, boolean availAble) {
        this.perKmRate = perKmRate;
        this.available = availAble;
    }
    public Integer getId() {
        return cabId;
    }
    public void setId(Integer cabId) {
        this.cabId = cabId;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}