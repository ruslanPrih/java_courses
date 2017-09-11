package com.prikhodko.generic0909;

import java.util.Arrays;

public class TestGeneric {
    public static void main(String[] args) {
        //Bucket bucket=new Bucket();
        Bucket <Integer>bucket=new Bucket<>();
        //bucket.add("ddd");
        //bucket.add(1L);
        bucket.add(100);
        //bucket.add(10.0);
        //bucket.add(new boolean[]{true});
        System.out.println(Arrays.toString(bucket.getT()));

        Function<String>function=new FunctionImpl<>();
        //function.add("dfojp");

        Bucket.print(new String("6549"));
        //Bucket.print("6549");

    }
}
