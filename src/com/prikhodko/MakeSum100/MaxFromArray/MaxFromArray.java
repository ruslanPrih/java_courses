package com.prikhodko.MakeSum100.MaxFromArray;
//Static Builder using

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxFromArray {
    private int[] array;
    private int max;

    private MaxFromArray(BuilderGetArray build) {
        this.array = build.array;
        max = DoVariants();
    }

    //doing number of variants
    private int DoVariants() {
        ArrayList<Integer> variants = new ArrayList();
        int variantCounter = 0;
        int n = array.length;
        int var = 0;//variant of number
        while (variantCounter <= Math.pow(n, n)) {
            try {
                var = Integer.parseInt(DoCombination());
            } catch (NumberFormatException e) {
                var = 0;
            }
            if (!variants.contains(var)) {
                variants.add(variantCounter, var);
            }
            variantCounter++;
        }
        max = FindMax(variants);
        return max;
    }

    //make new combination
    private String DoCombination() {
        String var = "";
        int[] combinationArray = array;
        int j = combinationArray.length - 1;
        combinationArray[j]++;
        while (combinationArray[j] == combinationArray.length) {
            combinationArray[j] = 0;
            if (j != 0) {
                j--;
            }
            combinationArray[j]++;
        }
        for (int e : combinationArray
                ) {
            var = var.concat(String.valueOf(e));

        }
        return var;
    }

    private int FindMax(ArrayList<Integer> array) {
        int maxFromArray = Integer.MIN_VALUE;
        for (Integer e : array
                ) {
            if (e > maxFromArray) maxFromArray = e;
        }
        return maxFromArray;
    }

    //Builder pattern
    public static class BuilderGetArray {
        final private int[] array;

        public BuilderGetArray(int[] array) {
            this.array = array;
        }

        public MaxFromArray build() {
            return new MaxFromArray(this);
        }
    }

    @Override
    public String toString() {
        return "MaxFromArray{" +
                "array=" + Arrays.toString(array) +
                ", max variant=" + max +
                '}';
    }
}
