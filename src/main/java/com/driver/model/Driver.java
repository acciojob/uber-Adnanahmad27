package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "driver")
public class Driver{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer driverId;
    private String mobNo;
    private String password;
    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();
    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    private Cab cab;

    public Driver() {
    }

    public Driver(String mobNo, String password) {
        this.mobNo = mobNo;
        this.password = password;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }
}