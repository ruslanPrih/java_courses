package com.prikhodko.testTask2907;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by руслан on 30.07.2017.
 */
public class TestErrors {
    public static void main(String[] args)  throws ParseException {


        Date date = new Date();
        Record r1 = new Record(date, 1, "cetre1", "OK");
        Record r2 = new Record(date, 2, "cetre2", "OK");
        Record r3 = new Record(date, 3, "cetre3", "OK");
        Record r4 = new Record("2017-07-30 18:08:12 !     cetre1 OK");
        Record r5 = new Record("2017-07-30 18:08:12 !!!   cetre2 OK");
        Record r6 = new Record("2017-07-30 18:08:12 !!!!! cetre3 OK");
        Record r7 = new Record("2017-07-31 18:08:17 !     cetre4 OK");
        Record r8 = new Record("2017-07-31 18:08:17 !!!   cetre5 OK");
        Record r9 = new Record("2017-07-31 18:08:17 !!!!! cetre6 OK");
//1 Add records
        System.out.println("\nadd records to Journal");
        Journal j = new Journal();
        j.add(r1);
        j.add(r2);
        j.add(r3);
        j.add(r4);
        j.add(r5);
        j.add(r6);
        System.out.println(j);

        Journal j1 = new Journal();
        j1.add(r7);
        j1.add(r8);
        j1.add(r9);
        System.out.println(j1);
//2
        System.out.println("\nadd records to J from J1");
        j.add(j1);
        System.out.println(j);

//3 remove
        System.out.println("\nremoving record");
        j.remove(r9);
        System.out.println(j);
//4 remove by index
        System.out.println("\nremoving record by index");
        j.remove(7);
        System.out.println(j);
//5 remove from index to index
        System.out.println("\nremoving record from index to index");
        j.remove(4,6);
        System.out.println(j);
//6 remove all
        System.out.println("\nremoving all records");
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
