package com.prikhodko;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by руслан on 04.06.2017.
 */
public class Classes0406ForCycle {
    static public void main(String[] args) {



        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter I");
        int i = s1.nextInt();

        if ( i<=7&& i>0){
        switch (i) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wensday");
                break;
            case 4:
                System.out.println("thirthday");
                break;
                case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("saturday");
                break;
                case 7:
                System.out.println("sunday");
                break;

                //исключение при неверном формате значения
            default:throw new IllegalArgumentException("Bad request");
        }

    }
else System.out.println("wrong number");


/*
//while 01
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        double a = s.nextDouble();
        System.out.println("Enter B");
        double b = s.nextDouble();
        int i01 = 0;
        while (a > b) {
            a = a - b;
            i01++;
        }
        System.out.println(a);
*/
//for 01
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("Enter K");
        int k = s.nextInt();
        System.out.println("Enter N");
        int n = s.nextInt();
        for (int i=0 ;i<n ; i++){
            System.out.println(k);
        }

        //break выход - из цикла
        //continue - новый цикл
        */

/*
        //метка плохая
        lab1:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
                if (j >= 5 && i > 5) break lab1;
            }
        }
*/
/*
//Замена For с блоком
        {
        int i = 0;
        while (i != 10) {
    i++;
            System.out.println(i);
            }

        }
*/
/*
// Cлучайные числа от -5 до 5
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        Random r= new Random();
        for (int i=0;i<n;i++){
            System.out.println(r.nextInt(11)-5);
            System.out.println("    " + ((int)(10*Math.random())-5));
        }
*/



    }

}
