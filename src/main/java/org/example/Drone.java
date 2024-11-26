package org.example;

import java.awt.*;

public class Drone extends Staff{
    private int freq;

    public Drone(String name, int freq, int gpsID, Color color) {
        super(name, gpsID,color);
        this.freq = freq;
    }
    public int getFreq() {
        return freq;
    }

    public void receiveAlert(String message) {
        System.out.println("Alert sent to Drone " + getName() + ": " + message);
    }

    @Override
    public void draw(Graphics g, Point location) {
        g.setColor(color);
        g.fillOval(location.x, location.y, 10, 10);
    }
}
