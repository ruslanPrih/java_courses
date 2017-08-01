package com.prikhodko.testTask2907;

import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.text.DateFormat;


/**
 * Created by руслан on 30.07.2017.
 */
public class TestErrors {
    public static void main(String[] args) {

        Date date = new Date();
        Record r=new Record(date,1,"cetre","OK" );
        System.out.println(r);
        Record r1=new Record("2017-07-30 18:08:12 !     cetre OK");
        System.out.println(r1);

        Journal j= new Journal();
        j.add(r);
        j.add(r1);
        System.out.println(j);
       // j.remove(0);
        //System.out.println(j);

        //j.remove(r);
        //System.out.println(j);
        //j.remove(0,1);
       // System.out.println(j);
        //j.removeAll();
       // System.out.println(j);
        Journal j1= new Journal();
        j1.add(r);
        j1.add(r1);
        j.add(j1);
        System.out.println(j);
    }
}
