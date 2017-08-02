package com.prikhodko.testTask2907;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

/**
 * Created by руслан on 30.07.2017.
 */
public class Record {
    /**
     * Class fields
     */
    private Date dateTime;
    private int importance;
    private String source;
    private String errorMessage;

    private String message;

    public Record(Date dateTime, int importance, String source, String errorMessage) {
        this.dateTime = dateTime;
        this.importance = importance;
        this.source = source;
        this.errorMessage = errorMessage;
        message = SetMessage();
    }

    public Record(String message) {
        this.message = message;
    }

    public Date GetTime (){
        return this.dateTime;
    }

    private String SetMessage() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] impMessage = {".    ", "!    ", "!!!  ", "!!!!!"};
        message = dateFormat.format(this.dateTime) + " " + impMessage[this.importance] + " " + this.source + " " + this.errorMessage;
        return message;
    }

    /**
     * @return String representation
     */
    @Override
    public String toString() {
        return message;
    }
}
