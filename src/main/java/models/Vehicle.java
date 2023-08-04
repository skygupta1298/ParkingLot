package models;

import enums.VehicleType;

public class Vehicle {

    private final VehicleType vehicleType;
    private final String registrationNo;
    private final String color;

    public Vehicle(VehicleType vehicleType, String registrationNo, String color) {
        this.vehicleType = vehicleType;
        this.registrationNo = registrationNo;
        this.color = color;
    }
}
