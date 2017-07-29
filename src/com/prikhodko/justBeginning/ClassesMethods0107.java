package com.prikhodko.justBeginning;

/**
 * Created by руслан on 01.07.2017.
 */
public class ClassesMethods0107 {


    private static double calc(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("No such operator");
        }
    }

    private static int inc(int a) {
        return a++;
    }

    private static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //return 0;
    }

    //определение аргумента через массив
    /*
    private static void ff( String... strings){

    }
    private static void ff(int a, String[]v){

    }
    private static void ff(String [5] s,int a ){

    */

    private static double newCalc(String[] operator, int[] arg) {
        double s = arg[0];
        for (int i = 0; i < arg.length - 1; i++) {
            s = operation(operator[i], s, arg[i + 1]);
        }
        return s;
    }

    private static double operation(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("No such operator");
        }
    }

    //from Kolja
    private static long revertNumber(long number) {
        long newNumber = 0;
        while (number > 0) {
            newNumber += (number % 10);
            newNumber *= ((number < 10) ? 1 : 10);
            number /= 10;
        }
        return newNumber;
    }


    public static void main(String[] args) {
        // System.out.println(calc(2,5,"-" ));
        //System.out.println(inc(5));
        //printArray(new int[][]{{2, 5, 6}, {15, 88, 989}, {58489, 8, 99}});
        //double exit = newCalc(new String[]{"-","+","*","/"}, new int []{12, 23, 858, 88, 6});
        /*
        String [] operator= new String[]{"-","+","*","/"};
        int [] argumet = new int []{12, 23, 858, 88, 6};
        double exit = newCalc(operator, argumet);
        System.out.println(exit);
        */
        System.out.println(revertNumber(10269));


    }

}
