package com.prikhodko.Oop1506;

/**
 * Created by руслан on 22.07.2017.
 */
public class CheckUtil {
    public static void check(boolean b, String message) {
        if (b) throw new IllegalArgumentException(message);
    }
}
