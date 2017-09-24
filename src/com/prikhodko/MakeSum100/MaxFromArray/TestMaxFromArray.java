package com.prikhodko.MakeSum100.MaxFromArray;

public class TestMaxFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{50, 2, 1, 9};
        MaxFromArray test = new MaxFromArray.BuilderGetArray(arr)
                .build();
        System.out.println(test);
    }
}
