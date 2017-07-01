package com.prikhodko;

/**
 * Created by руслан on 01.07.2017.
 */

import java.util.Scanner;

public class HomeWorkTwoPrinters0107 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines");
       String timeOut="";
        //number of lines
        int l = s.nextInt();
        for (int i = 0; i < l; i++) {
            System.out.println("Enter parameters: X, Y, N");
            int x = s.nextInt();
            int y = s.nextInt();
            int n = s.nextInt();
            int sumX = 0;
            int sumY = 0;
            int time = 0;
            while (sumX + sumY < n) {
                time++;
                sumX = time / x;
                sumY = time / y;
            }
            timeOut=timeOut.concat(" ").concat(Integer.toString(time));

        }

        System.out.print(timeOut + " ");
    }
}
