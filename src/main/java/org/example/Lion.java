package org.example;

import java.awt.*;

public class Lion extends Staff{
    private int age;

    public Lion(String name, int age, int gpsID) {
        super(name, gpsID);
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    @Override
    public void draw(Graphics g, Point location) {
        g.setColor(Color.RED);
        g.fillOval(location.x, location.y, 3, 3);
    }
}




