package com.prikhodko.figure2907;

public class IsoscelesTriangle extends Triangle{
    private double sideA;
    private double sideB;
    private double sideC;

    public IsoscelesTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = Math.abs(sideA);
    }
    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = Math.abs(sideB);
    }
    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = Math.abs(sideC);
    }

    @Override
    double getSquare() {
        double s=this.getPerimeter();
        return Math.pow((s*(s-sideA)*(s-sideB)*(s-sideC)),0.5);

    }

    @Override
    double getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
