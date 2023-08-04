package models;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
@Getter
public class Floor {

    private final Map<Integer, Slot> slotMap;
    private final int floorId;

    public Floor(int floorId) {
        this.slotMap = new HashMap<>();
        this.floorId = floorId;
    }

    public void addSlot() {

    }
}
