package com.prikhodko;

/**
 * Created by руслан on 17.06.2017.
 */
public class TestChar1706 {
    public static void main(String[] args) {
       for(int i=0;i<128;i++){
        System.out.println((char)i);
        }

        String s = "123";

        int c = (int) Integer.parseInt(s);
        int b = Integer.valueOf(s);
        System.out.println(c);
        System.out.println(b);

        char s2='9';
        int d = Character.getNumericValue(s2);
        int e = Character.digit(s2,10);
        System.out.println(d+1);
        System.out.println(e);

    }

}
