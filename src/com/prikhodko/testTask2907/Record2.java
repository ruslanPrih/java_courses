package com.prikhodko.testTask2907;


import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Record2 {
    /**
    *Class fields
     */
    private Date dateTime;
    private int importance;
    private String source;
    private String errorMessage;

    private String message;

    public Record2(Date dateTime, int importance, String source, String errorMessage) {
        this.dateTime = dateTime;
        this.importance = importance;
        this.source = source;
        this.errorMessage = errorMessage;
        message = SetMessage();
    }

    public Record2(String message) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            dateTime = format.parse(message.substring(0, 20).replaceAll("\\p{Cntrl}", ""));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        importance = FindImportanceIndex(message.substring(20).trim().substring(0, 5));
        source = message.substring(20).trim().substring(5).trim().substring
                (0, message.substring(20).trim().substring(5).trim().indexOf(" "));
        errorMessage=message.substring(20).trim().substring(5).trim().substring(source.length()+1);

        this.message = SetMessage();

    }

    int FindImportanceIndex(String s) {
        int importanceIndex = 0;
        String[] impMessage = {" ", ".    ", "!    ", "!!!  ", "!!!!!"};
        for (int i = 1; i < s.length(); i++) {
            if (s.equals(impMessage[i])) {
                importanceIndex = i;
            }
        }
        return importanceIndex;
    }

    private String SetMessage() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] impMessage = {" ", ".    ", "!    ", "!!!  ", "!!!!!"};
        message = dateFormat.format(this.dateTime) + " " + impMessage[this.importance] + " " + this.source + " " + this.errorMessage;
        return message;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public int getImportance() {
        return importance;
    }

    public String getSource() {
        return source;
    }

    /**
     * @return String representation
     */

    @Override
    public String toString() {
        return "\n" + message;
    }

}
