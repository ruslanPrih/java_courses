package com.prikhodko.testTask2907;

/**
 * Created by руслан on 30.07.2017.
 */
public class Journal {
    /**
     * Class fields
     */
    private int count;
    private Record[] records;

    public void add(Record r) {
        if (r == null)
            throw new IllegalArgumentException("Data cant be null!");
        if (records == null) records = new Record[25];
        records[count++] = r;
    }

    public void add(Journal j) {

    }

    public void remove(Record r) {


    }

    public void remove(int index) {
        if (records != null) {
            if (index != records.length - 1) {
                for (int i = index; i < records.length - 1; i++) {
                    records[i]= records[i + 1];
                }

            } else   records[index] =null;
        }
    }
    public void remove(int fromIndex, int toIndex){
        for (int i=fromIndex; i<=toIndex;i++){
            this.remove(i);
        }
    }
    public void removeAll(){
        records=null;
    }
}
