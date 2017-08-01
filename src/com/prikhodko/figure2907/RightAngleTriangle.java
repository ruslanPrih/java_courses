package com.prikhodko.figure2907;

public class RightAngleTriangle extends Triangle {
    private double base;
    private double height;

    public RightAngleTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = Math.abs(base);
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.height = Math.abs(height);
    }


    @Override
    double getSquare() {
        return base * height / 2;

    }

    @Override
    double getPerimeter() {
        return base + height + Math.pow((Math.sqrt(base) + Math.sqrt(height)),0.5);
    }

    @Override
    public String toString() {
        return "RightAngleTriangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
