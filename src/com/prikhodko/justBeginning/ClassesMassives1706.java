package com.prikhodko.justBeginning;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by руслан on 17.06.2017.
 */
public class ClassesMassives1706 {
    public static void main(String[] args) {

/*
//зеркальный переворот одномерного массива

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
            System.out.println("N " + i + "= " + arr[i]);
        }
        for (int i = 0; i <= arr.length / 2; i++) {
            arr[i] = arr[i] + arr[arr.length - 1 - i] - (arr[arr.length - 1 - i] = arr[i]);
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("N " + i + "= " + arr[i]);
        }
*/
//зеркальный переворот двухмерного массива по дианонали
/*
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        //заполнение массива случайными числами
        for (int i= 0; i<=arr.length-1;i++){
            for (int j=0; j<=arr.length-1;j++){
                arr[i][j] = (int) ((n + 1) * Math.random() - n / 2);
            }
        }

       //вывод массива
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }

        //переворот
        int temp;
        for (int i= 0; i<=arr.length-1;i++){
            for (int j=0; j<=i;j++){
                if (i!=j) {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        //вывод массива
        System.out.println("New mirror massive");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
*/

/*
//вывод многомерного массива
        //1
        System.out.println("Please enter Integer N");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Please enter Integer M");
        int m = sc.nextInt();

        //2
        int arr[][] = new int[n][m];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = r.nextInt(100);
            }
        }

        //3
        /*
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", arr[i][j]);

            }
            System.out.println();
        }
*/
/*
        //вывод через foreach
        for (int[] i : arr) {
            for (int j : i) {
                System.out.printf("%4d ", j);
            }
            System.out.println();
        }
        sc.close();
*/


    }

}
