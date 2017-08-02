package com.prikhodko.testTask2907;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Arrays;
import java.util.Comparator;


/**
 * Created by руслан on 30.07.2017.
 */
public class Journal {
    /**
     * Class fields
     */
    private int count;
    private Record[] records;

    //The lenth of massive??
    public void add(Record r) {
        if (r == null)
            throw new IllegalArgumentException("Data cant be null!");
        if (records == null) records = new Record[25];
        records[count++] = r;
    }

    public void add(Journal j) {
        int length = this.records.length + j.records.length;
        Record[] result = new Record[length];
        System.arraycopy(this.records, 0, result, 0, this.count);
        System.arraycopy(j.records, 0, result, this.count, j.count);
        this.records = result;
        this.count = this.count + j.count;
    }

    // DO we need to erase all found records??
    public void remove(Record r) {
        int index;
        if (records != null && r != null) {
            for (int i = 0; i < records.length; i++) {
                if (records[i] == r) {
                    index = i;
                    this.remove(index);
                }
            }
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= records.length) throw new IllegalArgumentException("Index is out of range!");
        if (records != null) {
            if (index != records.length - 1) {
                count--;
                for (int i = index; i < records.length - 1; i++) {
                    records[i] = records[i + 1];
                }
            } else {
                records[index] = null;
                count--;
            }
        }
    }

    public void remove(int fromIndex, int toIndex) {
        if (count >= toIndex - fromIndex + 1) {
            for (int i = fromIndex; i <= toIndex; i++) {
                this.remove(i);
            }
        } else throw new IllegalArgumentException("Out of annual data range");
    }

    public void removeAll() {
        records = null;
        count = 0;
    }

    public Journal filter(String s) {
        int counter = 0;
        Record[] result = new Record[this.records.length];
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        for (int i = 0; i < this.records.length; i++) {
            if (this.records[i] != null && this.records[i].toString().contains(s)) {
                result[counter] = records[i];
                counter++;
            }
        }
        this.count = counter;
        this.records = result;
        return this;
    }

    public Journal filter(Date fromDate, Date toDate) throws ParseException {
        int counter = 0;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Record[] result = new Record[this.records.length];
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        for (int i = 0; i < this.records.length; i++) {
            Date date = format.parse(this.records[i].toString().substring(0, 18));
            if (date.after(fromDate) && date.before(toDate)) {
                result[counter] = records[i];
                counter++;
            }
        }
        this.count = counter;
        this.records = result;
        return this;
    }

    public void sortByDate() {
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        Arrays.sort(this.records, new SortWithDate());
    }
    class SortWithDate implements Comparator<Record> {
        public int compare(Record obj1, Record obj2) {
            if (obj1!=null && obj2!=null) {
                String dateString1 = obj1.toString().substring(0, 18);
                String dateString2 = obj2.toString().substring(0, 18);
                return dateString1.compareTo(dateString2);
            }
            return  0;
        }
    }
    @Override
    public String toString() {
        return "Journal{" +
                "count=" + count +
                ", records=" + Arrays.toString(records) +
                '}';
    }

}
