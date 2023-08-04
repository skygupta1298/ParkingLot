import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import models.Floor;

import java.util.HashMap;
import java.util.Map;

import static utils.Constants.FLOOR_ADDITION_NOT_POSSIBLE_TEXT;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ParkingLot {

    private static volatile ParkingLot parkingLot;
    private final Map<Integer, Floor> floorMap;

    public static ParkingLot getInstance() {
        if(parkingLot == null) {
            synchronized (ParkingLot.class) {
                if(parkingLot == null) {
                    parkingLot = new ParkingLot();
                }
            }
        }
        return parkingLot;
    }

    public ParkingLot() {
        this.floorMap = new HashMap<>();
    }

    public void addFloor() {
        int floorId = floorMap.size() + 1;
        floorMap.put(floorId, new Floor(floorId));
    }

    public void addSlot(int floorId) {
        if(floorMap.containsKey(floorId)) {
            Floor floor = floorMap.get(floorId);
            floor.addSlot();
        }
        System.out.printf(FLOOR_ADDITION_NOT_POSSIBLE_TEXT, floorId);
    }
}
