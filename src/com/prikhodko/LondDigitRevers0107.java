package com.prikhodko;

import java.util.Arrays;

/**
 * Created by руслан on 01.07.2017.
 */
public class LondDigitRevers0107 {

    private static long londDigitRevers(long x) {
        long exit = 0;
        int counter = 0;
        while (Math.pow(10, counter) <= x) {
            counter++;
        }
        long[] arr = new long[counter];
        arr[0] = (long) (x % Math.pow(10, 1));
        for (int i = 1; i < counter; i++) {
            arr[i] = (long) ((x % Math.pow(10, i + 1) - arr[i - 1]) / Math.pow(10, i));
        }
        for (int i = 0; i < counter; i++) {
            exit += arr[i] * Math.pow(10, counter - i - 1);
        }
        return exit;
    }

    private static long londDigitReversBeta(long x) {
        long newX = 0;
        while (x > 0) {
            newX += (x % 10);
            newX *= ((x < 10) ? 1 : 10);
            x /= 10;
        }
        return newX;
    }


    //factorial calc
    private static long factorial(long f) {
        return (f == 1) ? 1 : f * factorial(f - 1);
    }


    public static void main(String[] args) {

        //System.out.println(londDigitRevers(123456));
        //System.out.println(factorial(5));
        System.out.println(londDigitReversBeta(123l));

    }
}
