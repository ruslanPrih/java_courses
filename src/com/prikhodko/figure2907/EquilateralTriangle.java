package com.prikhodko.figure2907;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle(double sideA) {
        super(sideA, sideA, sideA);
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideA=" + getSideA() +
                "} ";
    }
}
