package com.prikhodko.watches;

/**
 * Created by руслан on 26.07.2017.
 */
class CheckValue {
    public static void check(boolean b, String message_error) {
        if (b) throw new IllegalArgumentException(message_error);
    }
}
