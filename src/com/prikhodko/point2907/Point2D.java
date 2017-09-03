package com.prikhodko.point2907;

/**
 * Created by руслан on 29.07.2017.
 */
public class Point2D extends Point {
    private double y;

    public Point2D() {
    }

    public Point2D(double y) {
        this.y = y;
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double z) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "y=" + y +
                "}" + super.toString();

    }
    @Override
    public Point2D getPoint(){
        return this;
    }
}
