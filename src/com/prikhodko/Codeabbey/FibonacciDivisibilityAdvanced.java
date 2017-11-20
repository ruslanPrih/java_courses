package com.prikhodko.Codeabbey;

import java.util.Scanner;

public class FibonacciDivisibilityAdvanced {
    public static void main(String args[]) {
        System.out.println("Input data:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        String [] values = sc.nextLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            int val=Integer.valueOf(values[i]);
            if (val == 0) {
                System.out.println("Non zero input wanted!");
                return;
            } else {
                arr[i] = FibonacciDivisibility(val);
            }
        }
        for (int e : arr
                ) {
            System.out.print(e + " ");
        }
    }

    private static int FibonacciDivisibility(int val) {
        int n = 2;
        int e = 1;
        int ePrev = 1;
        int temp;
        while (e%val != 0) {
            temp = e;
            e += ePrev;
            ePrev = temp;
            ++n;
        }
        return n;
    }
}
