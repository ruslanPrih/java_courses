package com.prikhodko.watches;

/**
 * Created by руслан on 22.07.2017.
 */
public class Test {


    public static void main(String[] args) {
        Second a = new Second(45);
        System.out.println(a);
        a.setValue(50);
        System.out.println(a);
        a.addValue(5);
        System.out.println(a);

        Minute b = new Minute(0);
        System.out.println(b);
        b.addValue(2);
        System.out.println(b);
        System.out.println(b.getValue());
        b.setValue(45);
        System.out.println(b.getValue());
        System.out.println(b);
        System.out.println(a);


        Hour c = new Hour(6);
        System.out.println(c.getValue());
        c.setValue(5);
        System.out.println(c.getValue());
        System.out.println(c);


    }

}
