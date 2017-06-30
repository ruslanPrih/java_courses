package com.prikhodko;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by руслан on 27.05.2017.
 */
public class ClassesScanBouleaneIf2705 {
    public static void main(String[] args) {
/*
       //boulean 1
        Scanner s = new Scanner(System.in);
        System.out.println("Put number a");
        int a=s.nextInt();
        boolean x =a>0;
        System.out.println(x);
        //boulean 2
        Scanner s2 = new Scanner(System.in);
        System.out.println("Put number a");
        int a2=s.nextInt();
        boolean x2 = a2%2!=0;
        System.out.println(x);

        //boulean 3(9)
        Scanner s3 = new Scanner(System.in);
        System.out.println("Put number a");
        int a3=s.nextInt();

        System.out.println("Put number b");
        int b3=s.nextInt();
        boolean x3 = a3%2!=0||b3%2!=0;
        System.out.println(x);

        //boulean 20
        Scanner s20 = new Scanner(System.in);
        System.out.println("Put number a");
        int a20= s20.nextInt();
        int s20Hundreds=Math.round(a20/100);
        int s20TensI = Math.round((a20-Math.round(a20/100)*100)/10);
        int s20Ones = a20-a20*100 - a20*10;

        boolean x20 = s20Hundreds!=s20TensI && s20Hundreds!=s20Ones;
        System.out.println(x20);


        //IF1
        Scanner sIf1 = new Scanner(System.in);
        System.out.println("Put number a");
        int aIf1= sIf1.nextInt();
       if (aIf1>0)
       {
          aIf1+=1;
       }
       System.out.println(aIf1);


       //IF7
        Scanner sIf7 = new Scanner(System.in);
        System.out.println("Put number a");
        int aIf7= sIf7.nextInt();
        System.out.println("Put number b");
        int bIf7= sIf7.nextInt();
       if (aIf7>bIf7)
       {
           System.out.println(2);
       }
       System.out.println(1);

       //IF12
        Scanner sIf12 = new Scanner(System.in);
        System.out.println("Put number a");
        int aIf12= sIf12.nextInt();
        System.out.println("Put number b");
        int bIf12= sIf12.nextInt();
        System.out.println("Put number c");
        int cIf12= sIf12.nextInt();

       if (aIf12<bIf12&& aIf12<cIf12)
       {
           System.out.println(aIf12);
       } if (bIf12<aIf12&& bIf12<cIf12)
       {
           System.out.println(bIf12);
       } if (aIf12>cIf12&& bIf12>cIf12)
       {
           System.out.println(cIf12);
       }



        //IF12
        Scanner sIf12 = new Scanner(System.in);
        System.out.println("Put number a");
        int aIf12= sIf12.nextInt();
        System.out.println("Put number b");
        int bIf12= sIf12.nextInt();
        System.out.println("Put number c");
        int cIf12= sIf12.nextInt();

        System.out.println(Math.min(aIf12, Math.min(bIf12,cIf12)));*/

        //Тернарный оператор
        //вложенные условия

        Scanner sIf12 = new Scanner(System.in);
        System.out.println("Put number a");
        int aIf12= sIf12.nextInt();
        System.out.println("Put number b");
        int bIf12= sIf12.nextInt();
        System.out.println("Put number c");
        int cIf12= sIf12.nextInt();

        int xMinIf12= (aIf12>bIf12)&& (cIf12>bIf12)? bIf12: (aIf12>cIf12)&& (cIf12<bIf12)? cIf12: aIf12;
        System.out.println(xMinIf12);


    }
}
