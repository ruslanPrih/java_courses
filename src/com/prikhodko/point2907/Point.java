package com.prikhodko.point2907;

import java.util.Date;

/**
 * Created by руслан on 29.07.2017.
 */
public class Point {

    private double x;

    public Point() {
    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
return "Point{"+
        "x="+x+
        '}';
    }

    public Point getPoint(){
        return this;
    }

}
