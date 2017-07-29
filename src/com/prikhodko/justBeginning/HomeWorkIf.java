package com.prikhodko.justBeginning;

import java.util.Scanner;

/**
 * Created by руслан on 02.06.2017.
 */
public class HomeWorkIf {

    static public void main(String[] args) {
        //if9
        /*
        Scanner s9 = new Scanner(System.in);
        System.out.println("Enter A");
        double a9 = s9.nextDouble();
        System.out.println("Enter B");
        double b9 = s9.nextDouble();
        if (a9 < b9) {
            System.out.println("Variables are the same A=" + a9 + " B=" + b9);
        }else{
            a9=a9+b9-(b9=a9);
            System.out.println("Variables are replaced A=" + a9 + " B=" + b9);


        //if15
        Scanner s15 = new Scanner(System.in);
        System.out.println("Enter A");
        double a15 = s15.nextDouble();
        System.out.println("Enter B");
        double b15 = s15.nextDouble();
        System.out.println("Enter C");
        double c15 = s15.nextDouble();
        double min15 = 0;
        if (a15 < b15) {
            if (a15 < c15) {
                min15 = a15;
            } else min15 = c15;
        } else {
            if (b15 < c15) {
                min15 = b15;
            } else min15 = c15;
        }

        System.out.println("Sum of two bigger Variables =" + (a15 + b15 + c15 - min15));

        //if16
        Scanner s16 = new Scanner(System.in);
        System.out.println("Enter A");
        double a16 = s16.nextDouble();
        System.out.println("Enter B");
        double b16 = s16.nextDouble();
        System.out.println("Enter C");
        double c16 = s16.nextDouble();
        double min16 = 0;
        if (a16 < b16 && b16 < c16) {
            a16 = a16 * 2;
            b16 = b16 * 2;
            c16 = c16 * 2;
        } else {
            a16 = -1 * a16;
            b16 = -1 * b16;
            c16 = -1 * c16;
        }

        System.out.println("New Variables = " + a16 + " " + b16 + " " + c16);


        //if18
        Scanner s18 = new Scanner(System.in);
        System.out.println("Enter 3 numbs, 2 of them must be identical\nEnter A");
        double a18 = s18.nextDouble();
        System.out.println("Enter B");
        double b18 = s18.nextDouble();
        System.out.println("Enter C");
        double c18 = s18.nextDouble();
        int alone18=0;
        if (a18 == b18) {
            alone18=3;
        }
        if (a18==c18) {
            alone18 = 2;
        }
        if (b18==c18) {
            alone18 = 1;
        }
        System.out.println("Alone Variable #= " + alone18);

        //if19
        Scanner s19 = new Scanner(System.in);
        System.out.println("Enter 4 numbs, 3 of them must be identical\nEnter A");
        double a19 = s19.nextDouble();
        System.out.println("Enter B");
        double b19 = s19.nextDouble();
        System.out.println("Enter C");
        double c19 = s19.nextDouble();
        System.out.println("Enter D");
        double d19 = s19.nextDouble();
        int alone19 = 0;
        if (a19 == b19 && b19 == c19) {
            alone19 = 4;
        }
        if (a19 == b19 && b19 == d19) {
            alone19 = 3;
        }
        if (a19 == c19 && c19 == d19) {
            alone19 = 2;
        }
        if (b19 == c19 && b19 == d19) {
            alone19 = 1;
        }
        System.out.println("Alone Variable #= " + alone19);

        //if20
        Scanner s20 = new Scanner(System.in);
        System.out.println("Enter 3 points\nEnter A");
        double a20 = s20.nextDouble();
        System.out.println("Enter B");
        double b20 = s20.nextDouble();
        System.out.println("Enter C");
        double c20 = s20.nextDouble();

        int alone20 = 0;
        if (Math.abs(a20 - b20) < Math.abs(a20 - c20)) {
            System.out.println("B closer to A. Distance = " + (Math.abs(a20 - b20)));
        } else {
            System.out.println("C closer to A. Distance = " + (Math.abs(c20 - a20)));
        }

        //if21
        Scanner s21 = new Scanner(System.in);
        System.out.println("Enter   point coordinates\n Point 1\nEnter x ");
        double x21 = s21.nextDouble();
        System.out.println("Enter y");
        double y21 = s21.nextDouble();
        if (x21 == 0 && y21 == 0) {
            System.out.println("zero");
        } else if (y21 == 0) {
            System.out.println("1");
        }else if(x21==0){
            System.out.println("2");
        }
        else System.out.println("3" );


        //if25
        Scanner s25 = new Scanner(System.in);
        System.out.println("Enter   argument X");
        double x25 = s25.nextDouble();
        double f25 = 0;
        if (x25 < -2 || x25 > 2) {
            f25 = 2 * x25;
            System.out.println("Function " + f25);
        } else {
            f25 = -3 * x25;
            System.out.println("Function " + f25);
        }



        //if28
        Scanner s28 = new Scanner(System.in);
        System.out.println("Enter THE YEAR");
        double x28 = s28.nextDouble();
        if (x28 % 4 == 0) {
            if (x28 % 100 == 0 && x28 % 400 != 0) {
                System.out.println("UNSAXIOUS YEAR");
            }else System.out.println("LEAP YEAR");
        } else {
            f28 = -3 * x28;
            System.out.println("UNSAXIOUS YEAR");
        }

        //if29
        Scanner s29 = new Scanner(System.in);
        System.out.println("Enter THE NUMBER");
        int x29 = s29.nextInt();
        String val1 = "";
        String val2 = "";
        if (x29 % 2 == 0 && x29 != 0) {
            val2 = " and EVEN NUMBER";
        } else {
            val2 = " and ODD NUMBER";
        }
        if (x29 == 0) {
            val1 = "ZERO";
            val2 = "";
        } else {

            if (x29 > 0) {
                val1 = " A POSITIVE NUMBER";
            } else {
                val1 = " A NEGATIVE NUMBER";
            }
        }
        System.out.println(x29 + " is" + val1 + val2);

*/
        //if30
        Scanner s30 = new Scanner(System.in);
        System.out.println("Enter THE NUMBER");
        int x30 = s30.nextInt();
        String val1 = "";
        String val2 = "";
        if (x30 < 1 || x30 > 999) {
            System.out.println("Wrong number. One more time, please! By the way...");
        }
        if (x30 % 2 == 0 && x30 != 0) {
            val1 = " An EVEN ";
        } else {
            val1 = " An ODD ";
        }
        if (x30 >= 1 && x30 <= 9) {
            val2 = "and 1 digit";
        }
        if (x30 > 9 && x30 <= 99) {
            val2 = "and 2 digits";
        }
        if (x30 > 99 && x30 <= 999) {
            val2 = " and 3 digits";
        }
        System.out.println(x30 + " is" + val1 + val2 + " NUMBER");



    }


}
