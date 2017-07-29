package com.prikhodko.justBeginning;

import java.util.Scanner;

/**
 * Created by руслан on 28.05.2017.
 */
public class HomeWorkBoulean {
    public static void main(String[] args) {

        /*
        //boulean18


        Scanner sBoulean18 = new Scanner(System.in);
        System.out.println("Put number a");
        int aBoulean18 = sBoulean18.nextInt();
        System.out.println("Put number b");
        int bBoulean18 = sBoulean18.nextInt();
        System.out.println("Put number c");
        int cBoulean18 = sBoulean18.nextInt();

        boolean xBoulean18 = (aBoulean18 == bBoulean18) || (cBoulean18 == bBoulean18) || (cBoulean18 == aBoulean18);
        System.out.println(xBoulean18);


        //boulean 20
        Scanner s20 = new Scanner(System.in);
        System.out.println("Put number a");
        int a20 = s20.nextInt();
        int s20Hundreds = Math.round(a20 / 100);
        int s20Tens = Math.round((a20 - Math.round(a20 / 100) * 100) / 10);
        int s20Ones = a20 - a20Hundreds * 100 - a20Tens * 10;

        boolean x20 = (s20Hundreds != s20TensI) && (s20Hundreds != s20Ones);
        System.out.println(x20);
        
        //boulean 21
        Scanner s21 = new Scanner(System.in);
        System.out.println("Put number a");
        int a21 = s21.nextInt();
        int s21Hundreds = Math.round(a21 / 100);
        int s21Tens = Math.round((a21 - Math.round(a21 / 100) * 100) / 10);
        int s21Ones = a21 - s21Hundreds * 100 - s21Tens * 10;

        boolean x21 = s21Hundreds < s21Tens && s21Tens< s21Ones;
        System.out.println(x21);

        //boulean 22
        Scanner s22 = new Scanner(System.in);
        System.out.println("Put number a");
        int a22 = s22.nextInt();
        int s22Hundreds = Math.round(a22 / 100);
        int s22Tens = Math.round((a22 - Math.round(a22 / 100) * 100) / 10);
        int s22Ones = a22 - s22Hundreds * 100 - s22Tens * 10;

        boolean x22 = (s22Hundreds < s22Tens && s22Tens < s22Ones) || (s22Hundreds > s22Tens && s22Tens > s22Ones);
        System.out.println(x22);


        //boulean 23
        Scanner s23 = new Scanner(System.in);
        System.out.println("Put number a");
        int a23 = s23.nextInt();
        int s23Thousand = a23 / 1000;
        int s23Hundreds = Math.round((a23 - (a23 / 1000) * 1000) / 100);
        int s23Tens = Math.round((a23 - Math.round(a23 / 100) * 100) / 10);
        int s23Ones = a23 - s23Thousand * 1000 - s23Hundreds * 100 - s23Tens * 10;

        boolean x23 = (s23Thousand == s23Ones) && (s23Tens == s23Hundreds);
        System.out.println(s23Thousand + " " + s23Hundreds + " " + s23Tens + " " + s23Ones);
        System.out.println(x23);


        //boulean 24
        Scanner sBoulean24 = new Scanner(System.in);
        System.out.println("Put number a");
        int aBoulean24 = sBoulean24.nextInt();
        System.out.println("Put number b");
        int bBoulean24 = sBoulean24.nextInt();
        System.out.println("Put number c");
        int cBoulean24 = sBoulean24.nextInt();

        boolean xBoulean24 = (Math.pow(bBoulean24,2)-4*aBoulean24*cBoulean24) >= 0;
        System.out.println(xBoulean24);

        //boulean 29
        Scanner sBoulean29 = new Scanner(System.in);
        System.out.println("Upper left x,y");
        System.out.println("Put x");
        int x1Boulean29 = sBoulean29.nextInt();
        System.out.println("Put y");
        int y1Boulean29 = sBoulean29.nextInt();
        System.out.println("Below right x,y");
        System.out.println("Put x");
        int x2Boulean29 = sBoulean29.nextInt();
        System.out.println("Put y");
        int y2Boulean29 = sBoulean29.nextInt();
        System.out.println("Enter point x,y");
        System.out.println("Put x");
        int xBoulean29 = sBoulean29.nextInt();
        System.out.println("Put y");
        int yBoulean29 = sBoulean29.nextInt();

        boolean nBoulean29 = ((x1Boulean29 < xBoulean29) && (xBoulean29 < x2Boulean29)) && ((y1Boulean29 > yBoulean29) && (yBoulean29 > y2Boulean29));
        System.out.println(nBoulean29);



        //boulean 33

        Scanner sBoulean33 = new Scanner(System.in);
        System.out.println("Put side a");
        int aBoulean33 = sBoulean33.nextInt();
        System.out.println("Put side b");
        int bBoulean33 = sBoulean33.nextInt();
        System.out.println("Put side c");
        int cBoulean33 = sBoulean33.nextInt();
        boolean nBoulean33 = (aBoulean33+bBoulean33>=cBoulean33)&&(aBoulean33<=bBoulean33+cBoulean33)&&(bBoulean33<=cBoulean33+cBoulean33);
        System.out.println(nBoulean33);


        //boulean 34
        Scanner sBoulean34 = new Scanner(System.in);
        System.out.println("Enter x,y");
        System.out.println("Put x");
        int xBoulean34 = sBoulean34.nextInt();
        System.out.println("Put y");
        int yBoulean34 = sBoulean34.nextInt();
        boolean nBoulean34 = (xBoulean34 + 2) % 2 == 0 && (yBoulean34 + 2) % 2 == 0;
        System.out.println(nBoulean34);


        //boulean 35
        Scanner sBoulean35 = new Scanner(System.in);
        System.out.println("Enter  first x,y");
        System.out.println("Put x");
        int x1Boulean35 = sBoulean35.nextInt();
        System.out.println("Put y");
        int y1Boulean35 = sBoulean35.nextInt();
        System.out.println("Enter another x,y");
        System.out.println("Put x");
        int x2Boulean35 = sBoulean35.nextInt();
        System.out.println("Put y");
        int y2Boulean35 = sBoulean35.nextInt();
        boolean n1Boulean35 = (x1Boulean35 + 2) % 2 == 0 && (y1Boulean35 + 2) % 2 == 0;
        boolean n2Boulean35 = (x2Boulean35 + 2) % 2 == 0 && (y2Boulean35 + 2) % 2 == 0;
        boolean nBoulean35 = n1Boulean35==n2Boulean35;
        System.out.println(nBoulean35);
 

        //boulean 36
        Scanner sBoulean36 = new Scanner(System.in);
        System.out.println("Enter  first x,y");
        System.out.println("Put x");
        int x1Boulean36 = sBoulean36.nextInt();
        System.out.println("Put y");
        int y1Boulean36 = sBoulean36.nextInt();
        System.out.println("Enter another x,y");
        System.out.println("Put x");
        int x2Boulean36 = sBoulean36.nextInt();
        System.out.println("Put y");
        int y2Boulean36 = sBoulean36.nextInt();
        boolean nBoulean36 = (x1Boulean36 == x2Boulean36) ||(y1Boulean36 == y2Boulean36);
        System.out.println("Tura moovement  " + nBoulean36);

        //boulean 37
        Scanner sBoulean37 = new Scanner(System.in);
        System.out.println("Enter  first x,y");
        System.out.println("Put x");
        int x1Boulean37 = sBoulean37.nextInt();
        System.out.println("Put y");
        int y1Boulean37 = sBoulean37.nextInt();
        System.out.println("Enter another x,y");
        System.out.println("Put x");
        int x2Boulean37 = sBoulean37.nextInt();
        System.out.println("Put y");
        int y2Boulean37 = sBoulean37.nextInt();
        boolean nBoulean37 = ((Math.abs(x1Boulean37 - x2Boulean37)<=1)&& (Math.abs(y1Boulean37 - y2Boulean37)<=1)) ;
        System.out.println("King moovement across the- " + nBoulean37);


        //boulean 38
        Scanner sBoulean38 = new Scanner(System.in);
        System.out.println("Enter  first x,y");
        System.out.println("Put x");
        int x1Boulean38 = sBoulean38.nextInt();
        System.out.println("Put y");
        int y1Boulean38 = sBoulean38.nextInt();
        System.out.println("Enter another x,y");
        System.out.println("Put x");
        int x2Boulean38 = sBoulean38.nextInt();
        System.out.println("Put y");
        int y2Boulean38 = sBoulean38.nextInt();
        boolean nBoulean38 = (Math.abs(x1Boulean38 - x2Boulean38) == (Math.abs(y1Boulean38 - y2Boulean38);
        System.out.println("Elefant moovement - " + nBoulean38);

        //boulean 39
        Scanner sBoulean39 = new Scanner(System.in);
        System.out.println("Enter  first x,y");
        System.out.println("Put x");
        int x1Boulean39 = sBoulean39.nextInt();
        System.out.println("Put y");
        int y1Boulean39 = sBoulean39.nextInt();
        System.out.println("Enter another x,y");
        System.out.println("Put x");
        int x2Boulean39 = sBoulean39.nextInt();
        System.out.println("Put y");
        int y2Boulean39 = sBoulean39.nextInt();
        boolean nBoulean39 = (Math.abs(x1Boulean39 - x2Boulean39) == Math.abs(y1Boulean39 - y2Boulean39))||((x1Boulean39 == x2Boulean39) ||(y1Boulean39 == y2Boulean39));
        System.out.println("Qween moovement - " + nBoulean39);
 */
        //boulean 40
        Scanner sBoulean40 = new Scanner(System.in);
        System.out.println("Enter  first x,y");
        System.out.println("Put x");
        int x1Boulean40 = sBoulean40.nextInt();
        System.out.println("Put y");
        int y1Boulean40 = sBoulean40.nextInt();
        System.out.println("Enter another x,y");
        System.out.println("Put x");
        int x2Boulean40 = sBoulean40.nextInt();
        System.out.println("Put y");
        int y2Boulean40 = sBoulean40.nextInt();
        boolean nBoulean40 = (Math.abs(x1Boulean40 - x2Boulean40) == 2 && Math.abs(y1Boulean40 - y2Boulean40) == 1) || (Math.abs(x1Boulean40 - x2Boulean40) == 1 && Math.abs(y1Boulean40 - y2Boulean40) == 2);
        System.out.println("Qween moovement - " + nBoulean40);
    }
}
