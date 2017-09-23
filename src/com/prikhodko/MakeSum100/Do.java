package com.prikhodko.MakeSum100;
import java.util.Arrays;
public class Do {
    public static void main(String[] args) {
        int[] arrayOfCombinations = new int[3];
        int cnt_variants=0;
        while (cnt_variants <= (int) Math.pow(3, 3)) {
            cnt_variants++;

        nextCombinations(3, arrayOfCombinations);

        for (int s: arrayOfCombinations
             ) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
    }
    public static void nextCombinations(int combinations, int[] arrayOfCombinations) {
        int j = arrayOfCombinations.length - 1;
        arrayOfCombinations[j]++;
        while (arrayOfCombinations[j] == combinations) {
            arrayOfCombinations[j] = 0;
            if (j != 0) {
                j--;
            }
            arrayOfCombinations[j]++;

        }
    }
}
