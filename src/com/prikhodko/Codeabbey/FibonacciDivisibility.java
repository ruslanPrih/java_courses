package com.prikhodko.Codeabbey;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciDivisibility {
    public static void main(String args[]) {
        System.out.println("Input data:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        String [] values = sc.nextLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            BigInteger val= BigInteger.valueOf(Long.parseLong(values[i]));
            if (val.compareTo(BigInteger.valueOf(0)) == 0) {
                System.out.println("Non zero input wanted!");
                return;
            } else if (val.compareTo(BigInteger.valueOf(1)) == 0) {
                arr[i] = 1;
            } else {
                arr[i] = FibonacciDivisibility(val);
            }
        }
        for (int e : arr
                ) {
            System.out.print(e + " ");
        }
    }


    private static int FibonacciDivisibility(BigInteger val) {
        int n = 2;
        BigInteger e = new BigInteger("1");
        BigInteger ePrev = new BigInteger("1");
        BigInteger temp;
        BigInteger mod= new BigInteger("1");
        while (mod.mod(val).compareTo(BigInteger.valueOf(0)) != 0) {
            temp = e;
            e = e.add(ePrev);
            ePrev = temp;
            mod=e.mod(val);
            ++n;

        }
        return n;
    }
}
