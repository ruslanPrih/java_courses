package com.prikhodko.figure2907;

/**
 * Created by руслан on 29.07.2017.
 */
public class Circle extends Figure{
    private double radius;
    public Circle(double radius) {
        this.radius = Math.abs(radius);
    }

    @Override
    double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * Math.abs(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} ";
    }
}
