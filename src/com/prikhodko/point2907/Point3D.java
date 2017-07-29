package com.prikhodko.point2907;

/**
 * Created by руслан on 29.07.2017.
 */
public class Point3D extends Point2D {
    private double z;
    public Point3D(){}

    public Point3D (double z){
        this.z=z;
    }
    public Point3D (double y, double z){
        super(y);
        this.z=z;
    }
    public Point3D (double x, double y, double z){
        super(x,y);
        this.z=z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public double getZ() {
       return z;
    }
    @Override
    public String toString() {
        return "Point2D{"+
                "z="+z+
                "}"+super.toString();
    }
}
