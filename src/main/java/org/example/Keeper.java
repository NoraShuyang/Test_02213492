package org.example;

import java.awt.*;

public class Keeper extends Staff{
    private int phoneNumber;


    public Keeper(String name, int phoneNumber, int gpsID) {
        super(name, gpsID);
        this.phoneNumber = phoneNumber;

    }

    @Override
    public void draw(Graphics g, Point location) {
        g.setColor(Color.BLUE);
        g.fillOval(location.x, location.y, 2, 2);
    }

    public void receiveAlert(String msg) {
        System.out.println("Alert to Keeper " + getName() + ": " + msg);
    }
}
