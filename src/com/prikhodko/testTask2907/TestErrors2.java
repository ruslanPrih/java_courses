package com.prikhodko.testTask2907;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by руслан on 30.07.2017.
 */
public class TestErrors2 {
    public static void main(String[] args)  throws ParseException {


        Date date = new Date();
        Record2 r1 = new Record2(date, 1, "cetre1", "OK");
        Record2 r2 = new Record2(date, 2, "cetre2", "OK");
        Record2 r3 = new Record2(date, 3, "cetre3", "OK");
        Record2 r4 = new Record2("2017-07-30 18:08:12 !        cetre1 OK");
        Record2 r5 = new Record2("2017-07-30 18:08:12 !!!   cetre2   O  K");
        Record2 r6 = new Record2("2017-07-30 18:08:12 !!!!! cetresd3 OK");
        Record2 r7 = new Record2("2017-07-31 18:08:17 !     cetre4 OK");
        Record2 r8 = new Record2("2017-07-31 18:08:17 !!!   cetre5 OK");
        Record2 r9 = new Record2("2017-07-31 18:08:17 !!!!! cetre6 OK");
//1 Add Record2s
        System.out.println("\nadd Record2s to Journal2");
        Journal2 j = new Journal2();
        j.add(r1);
        j.add(r2);
        j.add(r3);
        j.add(r4);
        j.add(r5);
        j.add(r6);
        System.out.println(j);

        Journal2 j1 = new Journal2();
        j1.add(r7);
        j1.add(r8);
        j1.add(r9);
        System.out.println(j1);
//2
        System.out.println("\nadd Record2s to J from J1");
        j.add(j1);
        System.out.println(j);

//3 remove
        System.out.println("\nremoving Record2");
        j.remove(r9);
        System.out.println(j);
//4 remove by index
        System.out.println("\nremoving Record2 by index");
        j.remove(7);
        System.out.println(j);
//5 remove from index to index
        System.out.println("\nremoving Record2 from index to index");
        j.remove(4,6);
        System.out.println(j);
//6 remove all
        System.out.println("\nremoving all Record2s");
        j.removeAll();
        System.out.println(j);
        j.add(r1);
        j.add(r2);
        j.add(r3);
        j.add(r4);
        j.add(r5);
        j.add(r6);
        j.add(r7);
        j.add(r8);
        j.add(r9);

//7 filter String
        System.out.println(j);
        System.out.println("\nfilter with 2017-07-31");
        j.filter("2017-07-31");
        System.out.println(j);
        j.add(r1);
        j.add(r2);
        j.add(r3);
        j.add(r4);
        j.add(r5);
        j.add(r6);

//8 filter from date to date

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = format.parse("2017-07-30 17:08:17");
        Date date3 = format.parse("2017-07-31 19:08:17");

        System.out.println(j);
        System.out.println("\nfrom date 2017-07-30 17:08:17 to date 2017-07-31 19:08:17");
        j.filter(date2,date3);
        System.out.println(j);
        j.add(r1);
        j.add(r2);
        j.add(r3);

//9 sort by date
        System.out.println("\nsortByDate()");
        j.sortByDate();
        System.out.println(j);

//10 sortByImportanceDate
        System.out.println("\nsortByImportanceDate()");
        j.sortByImportanceDate();
        System.out.println(j);

//11
        System.out.println("\nsortByImportanceSourceDate()");
        j.sortByImportanceSourceDate();
        System.out.println(j);
//12
        System.out.println("\nsortBySourceDate()");
        j.sortBySourceDate();
        System.out.println(j);
    }
}
