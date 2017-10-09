package com.prikhodko.MakeSum100.MaxFromArray;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMaxFromArray {
    public static void main(String[] args) {

        int[] arr = new int[]{50, 2, 1, 9};

        MaxFromArray test = new MaxFromArray.BuilderGetArray(arr)
                .build();
        System.out.println(test);

/*
        ArrayList<String> arr = new ArrayList();
        arr.add("asihd");
        arr.add("aDjjl");
        arr.add("ADCV");
        arr.add("Ajkl");
        System.out.println(new ArrayAnalis().FindMax(arr));
*/
/*
        ArrayList<Integer> arr = new ArrayList();
        arr.add(258);
        arr.add(33);
        arr.add(20);
        System.out.println(new ArrayAnalis().FindMax(arr));
*/
    }
}

