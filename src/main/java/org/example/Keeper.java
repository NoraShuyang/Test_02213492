package org.example;

import java.awt.*;

public class Keeper extends Staff{
    private int phoneNumber;


    public Keeper(String name, int phoneNumber, int gpsID, Color color) {
        super(name, gpsID, color);
        this.phoneNumber = phoneNumber;

    }

    @Override
    public void draw(Graphics g, Point location) {
        g.setColor(color);
        g.fillOval(location.x, location.y, 10, 10);
    }

    public void receiveAlert(String msg) {
        System.out.println("Alert to Keeper " + getName() + ": " + msg);
    }
}
