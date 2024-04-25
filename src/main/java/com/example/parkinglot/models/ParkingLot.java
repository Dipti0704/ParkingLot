package com.example.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter

public class ParkingLot {
    private int id;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private EnumParkingStatus parkingStatus;
}
