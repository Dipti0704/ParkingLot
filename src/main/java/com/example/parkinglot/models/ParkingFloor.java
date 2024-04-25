package com.example.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor {
    private int id;
    private long number;
    private List<ParkingSpot> parkingSpots;
    private EnumParkingStatus parkingStatus;

}
