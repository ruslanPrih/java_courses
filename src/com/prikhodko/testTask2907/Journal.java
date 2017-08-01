package com.prikhodko.testTask2907;

//import java.util.Arrays;

import java.util.Arrays;

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
        int length = this.records.length+j.records.length;
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


    @Override
    public String toString() {
        return "Journal{" +
                "count=" + count +
                ", records=" + Arrays.toString(records) +
                '}';
    }
}
