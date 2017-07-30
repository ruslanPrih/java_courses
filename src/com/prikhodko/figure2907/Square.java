package com.prikhodko.figure2907;

/**
 * Created by руслан on 29.07.2017.
 */
public class Square extends Rectangle {
    public Square(double width) {
        super(Math.abs(width), Math.abs(width));
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + getWidth() +
                "} ";
    }
}
