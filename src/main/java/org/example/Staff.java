package org.example;
import java.awt.*;
import java.io.IOException;

import static org.example.LocationSystem.getCoords;

public abstract class Staff {
    protected String name;
    protected int gpsID;
    protected Color color;

    public Staff(String name, int gpsID) {
        this.name = name;
        this.gpsID = gpsID;
    }
    public String getName() {
        return name;
    }
    public int getGpsID() {
        return gpsID;
    }
    public Point location(int gpsID) throws IOException {
        this.gpsID = gpsID;
        Point coords = getCoords(gpsID);
        return coords;
    }
    public abstract void draw(Graphics g, Point location);
}
