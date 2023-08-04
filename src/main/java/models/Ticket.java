package models;

import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@ToString
@Getter
public class Ticket {

    private final String ticketId;
    private final String parkingLotId;
    private final int floorId;
    private final int slotNo;
    private final Vehicle vehicle;
    private final int duration;
    private final double price;
    private final Instant creationTime;

    public Ticket(String ticketId, String parkingLotId, int floorId, int slotNo, Vehicle vehicle, int duration, double price) {
        this.ticketId = ticketId;
        this.parkingLotId = parkingLotId;
        this.floorId = floorId;
        this.slotNo = slotNo;
        this.vehicle = vehicle;
        this.duration = duration;
        this.price = price;
        this.creationTime = Instant.now();
    }

}
