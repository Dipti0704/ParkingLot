package com.example.parkinglot.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Payment {
    private int id;
    private EnumMode mode;
    private double amount;
    private Date time;
    private EnumPaymentStatus paymentStatus;
}
