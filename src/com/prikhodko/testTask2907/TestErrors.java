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
        Record r = new Record(date, 1, "cetre", "OK");
        System.out.println(r);
        Record r1 = new Record("2017-07-30 18:08:12 !!!   cetre1 OK");
        System.out.println(r1);
        Record r2 = new Record("2017-07-31 18:08:17 !     cetre2 OK");
        System.out.println(r2);
        Record r3 = new Record("2017-07-30 18:08:17 !     cetre3 OK");
        System.out.println(r3);
        Record r4 = new Record("2017-07-31 18:08:12 !     cetre4 OK");
        System.out.println(r4);

        Journal j = new Journal();
        j.add(r3);
        j.add(r4);
        j.add(r1);
        j.add(r);
        j.add(r2);


        System.out.println(j);

        // j.remove(0);
        //System.out.println(j);

        //j.remove(r);
        //System.out.println(j);
        //j.remove(0,1);
        // System.out.println(j);
        //j.removeAll();
        // System.out.println(j);
/*
        Journal j1 = new Journal();
        j1.add(r);
        j1.add(r1);
        /*
        j.add(j1);
        System.out.println(j);

        */
/*
        j.sortByDate();
        System.out.println(j);

        j.sortByImportanceDate();
        System.out.println(j);


        System.out.println(j);
        */
/*
        j.sortBySource();
        System.out.println(j);
        System.out.println("centr+6+".compareTo("centre3"));
        j.sortByImportanceDate();
        System.out.println(j);
        j.sortBySource();
        */
        System.out.println("\nsortByImportanceDate()");
        j.sortByImportanceDate();
        System.out.println(j);

        System.out.println("\nsortByImportanceSourceDate()");
        j.sortByImportanceSourceDate();
        System.out.println(j);

        System.out.println("\nsortBySourceDate()");
        j.sortBySourceDate();
        System.out.println(j);


    }
}
