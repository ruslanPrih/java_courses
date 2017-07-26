package com.prikhodko.watches;

/**
 * Created by руслан on 22.07.2017.
 */
public class Hour extends Minute {
    private int value;

    public Hour (int value) {
        super(value);
        CheckValue.check(value<0||value>11, message_error);
        this.value = value;
    }

    @Override
    public void setValue(int value) {
        CheckValue.check(value<0||value>11, message_error);
        if (value >= 0 || value < 12) {
            this.value = value;
        }
    }
    public int getValue() {
        return this.value;
    }
    @Override
    public void addValue(int value) {
        int d = (value + this.getValue());
        this.setValue(d % 12);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"s" +" " + this.value;
    }

}
