package com.prikhodko.watches2207;

/**
 * Created by руслан on 22.07.2017.
 */
public class Second {

    private int value;
    public final String message_error = this.getClass().getSimpleName() + "s" + " can't be more than 59 second";

    public Second() {
    }

    public Second(int value) {
        CheckValue.check(value < 0 || value > 59, message_error);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        CheckValue.check(value < 0 || value > 59, message_error);
        if (value >= 0 && value <= 59) {
            this.value = value;
        }
    }

    public void addValue(int value) {
        int d = (value + this.getValue());
        this.setValue(d % 60);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "s" + " " + value;
    }


}
