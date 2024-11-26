package org.example;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GPStracker {
    private Map<Integer, int[]> gpsData;

    public GPStracker() {
        gpsData = new HashMap<>();
    }

    public void updateLocation(int gpsID, Point location) {

        gpsData.put(gpsID, new int[] {location.x, location.y});
    }

    public int[] getLocation(int gpsID) {
        return gpsData.get(gpsID);
    }


}
