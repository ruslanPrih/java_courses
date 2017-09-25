package com.prikhodko.MakeSum100.MaxFromArray;
//pattern Builder using just for fun

import java.util.ArrayList;
import java.util.Arrays;

public class MaxFromArray {
    private int[] array;
    private int max;

    private MaxFromArray(BuilderGetArray build) {
        array = build.array;
        max = DoVariants();
    }

    //doing array of variants
    private int DoVariants() {
        ArrayList<Integer> variants = new ArrayList();
        int variantCounter = 0;
        int n = array.length;
        int variant = Integer.MIN_VALUE;//variant of number set
        while (variantCounter <= Math.pow(n, n)) {
            try {
                variant = Integer.parseInt(DoCombination(array));
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            if (!variants.contains(variant)) {
                variants.add(variant);
            }
            variantCounter++;
        }
        max = FindMax(variants);
        return max;
    }

    //make new combination with FisherYets shuffle algorithm
    private String DoCombination(int[] arr) {
        String var = "";
        int[] combinationArray = Arrays.copyOf(arr, arr.length);
        int temp;

        for (int i = combinationArray.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1)); //
            temp = combinationArray[index];
            combinationArray[index] = combinationArray[i];
            combinationArray[i] = temp;
        }
        for (int e : combinationArray
                ) {
            var = var.concat(String.valueOf(e));
        }
        return var;
    }

    private int FindMax(ArrayList<Integer> arr) {
        int maxFromArray = Integer.MIN_VALUE;
        for (Integer e : arr
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
