package com.example.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingSpot {
   private int id;
   private long number;
   private List<EnumVehicleType> vehicleTypes;
   private EnumParkingStatus parkingStatus;
   private ParkingFloor parkingFloor;
}
