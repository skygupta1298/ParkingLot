package models;

import enums.VehicleType;
import lombok.Getter;

@Getter
public class Slot {

    private final VehicleType vehicleType;
    private boolean isOccupied;

    public Slot(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }
}
