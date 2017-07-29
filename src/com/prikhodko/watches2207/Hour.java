package com.prikhodko.watches2207;

/**
 * Created by руслан on 22.07.2017.
 */
public class Hour extends Minute {


    public Hour(int value) {
        setValue(value);
    }

    public void setValue(int value) {
        CheckValue.check(value < 0 || value > 11, message_error);
        super.setValue(value);
    }

    public void addValue(int value) {
        int d = (value + super.getValue());
        setValue(d % 12);
    }

}
