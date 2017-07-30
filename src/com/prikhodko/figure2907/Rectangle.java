package com.prikhodko.figure2907;

/**
 * Created by руслан on 29.07.2017.
 */
public class Rectangle extends Figure{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = Math.abs(width);
        this.length = Math.abs(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.abs(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.abs(length);
    }

    @Override
    public double getSquare() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (Math.abs(width) + Math.abs(length));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "} ";
    }

}
