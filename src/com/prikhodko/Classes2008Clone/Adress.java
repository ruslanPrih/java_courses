package com.prikhodko.Classes2008Clone;

public class Adress {
    private  int flat;
    private  String street;
    private  String city;

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Adress(int flat, String street, String city) {
        this.flat = flat;
        this.street = street;
        this.city = city;
    }




    public int getFlat() {
        return flat;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
    @Override
    protected  Adress clone(){
        try{
            return (Adress) super.clone();
        } catch (CloneNotSupportedException e){
            throw new IllegalArgumentException();
        }
    }
    @Override
    public String toString() {
        return "Adress{" +
                "flat='" + flat + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
