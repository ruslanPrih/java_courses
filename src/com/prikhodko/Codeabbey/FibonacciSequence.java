package com.prikhodko.Codeabbey;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String args[]) {
        System.out.println("Input data:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            BigInteger val = new BigInteger(sc.nextLine());
            if (val.compareTo(BigInteger.valueOf(0)) == 0) {
                arr[i] = 0;
            } else if (val.compareTo(BigInteger.valueOf(1)) == 0) {
                arr[i] = 1;
            } else {
                arr[i] = FibonacciPosition(val);
            }
        }
        for (int e : arr
                ) {
            System.out.print(e + " ");
        }
    }


    private static int FibonacciPosition(BigInteger val) {
        int n = 1;
        BigInteger e = new BigInteger("1");
        BigInteger ePrev = new BigInteger("1");
        BigInteger temp;
        while (e.compareTo(val) <= 0) {
            temp = e;
            e = e.add(ePrev);
            ePrev = temp;
            n++;
        }
        return n;
    }
}
