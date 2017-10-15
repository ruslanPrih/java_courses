package com.prikhodko.Codeabbey;


import java.util.Scanner;

public class LinearFunction {
    public static void main(String args[]) {
        System.out.println("Input data:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] answers = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().trim().split(" ");
            int x1 = Integer.parseInt(data[0]);
            int y1 = Integer.parseInt(data[1]);
            int x2 = Integer.parseInt(data[2]);
            int y2 = Integer.parseInt(data[3]);
            int a = (y1 - y2) / (x1 - x2);
            int b = y1 - a * x1;
            answers[i][0] = a;
            answers[i][1] = b;
        }
        for (int i = 0; i < n; i++) System.out.print("(" + answers[i][0] + " " + answers[i][1] + ") ");
    }
}

