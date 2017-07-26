package com.prikhodko.watches;

/**
 * Created by руслан on 22.07.2017.
 */
public class Hour extends Minute {
    private int hour;
   // public Hour () {super();}

    public Hour (int hour) {
        CheckValue.check(hour<0||hour>11, message_error);
        this.hour = hour;
    }

    @Override
    public void setValue(int hour) {
        CheckValue.check(hour<0||hour>11, message_error);
        if (hour >= 0 || hour < 12) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException(message_error);
        }
    }
/*
    public int gethour() {
        return this.hour;
    }
*/
    @Override
    public void addValue(int hour) {
        int d = (hour + this.getValue());
        this.setValue(d % 12);
    }


}
