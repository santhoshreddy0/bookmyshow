package org.santhosh.bookmyshow.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> showSeats;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    private double amount;
    @OneToMany
    private List<Payment> payments;
}

/*
* Booking :: User => M :: 1
* Booking :: Show => M :: 1
* Booking :: ShowSeat => 1 :: M
* Booking :: Payment => 1 :: M
* */