package com.prikhodko.testTask2907;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Comparator;

public class Journal2 {
    /**
     * Class fields
     */
    private int count;
    private Record2[] records;

    /**
     * Add records
     */
    //The lenth of massive??
    public void add(Record2 r) {
        if (r == null)
            throw new IllegalArgumentException("Data cant be null!");
        if (records == null) records = new Record2[25];
        records[count++] = r;
    }

    public void add(Journal2 j) {
        if (j == null)
            throw new IllegalArgumentException("Data cant be null!");
        int length = this.records.length + j.records.length;
        Record2[] result = new Record2[length];
        System.arraycopy(this.records, 0, result, 0, this.count);
        System.arraycopy(j.records, 0, result, this.count, j.count);
        this.records = result;
        this.count = this.count + j.count;
    }

    /**
     * Remove records
     */
    // DO we need to erase all found records??
    public void remove(Record2 r) {
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

    /**
     * Filter Journal
     */
    public Journal2 filter(String s) {
        int counter = 0;
        Record2[] result = new Record2[this.records.length];
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

    public Journal2 filter(Date fromDate, Date toDate) throws ParseException {
        int counter = 0;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Record2[] result = new Record2[this.records.length];
        try {
            if (this == null) throw new IllegalArgumentException("Data cant be null!");
            for (int i = 0; i < this.records.length; i++) {
                if (records[i] != null) {
                    Date date = format.parse(this.records[i].toString().substring(0, 20).replaceAll("\\p{Cntrl}", ""));
                    if (date.after(fromDate) && date.before(toDate)) {
                        result[counter] = records[i];
                        counter++;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        this.count = counter;
        this.records = result;
        return this;
    }

    /**
     * Sort by...
     */

    public void sortByDate() {
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        Arrays.sort(this.records, new ByDate() {
                }
        );
    }

    class ByDate implements Comparator<Record2> {
        @Override
        public int compare(Record2 obj1, Record2 obj2) {
            if (obj1 != null && obj2 != null) {
                Date date1 = obj1.getDateTime();
                Date date2 = obj2.getDateTime();
                if (date1.before(date2)) {
                    return -1;
                } else if (date1.after(date2)) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }
    }

    public void sortByImportanceDate() {
        if (this == null) throw new IllegalArgumentException("Data cant be null!");
        Arrays.sort(this.records, new ByImportance().thenComparing(new ByDate()));
    }

    class ByImportance implements Comparator<Record2> {
        @Override
        public int compare(Record2 obj1, Record2 obj2) {
            if (obj1 != null && obj2 != null) {
                int importence1 = obj1.getImportance();
                int importence2 = obj2.getImportance();

                if (importence1 > importence2) {
                    return 1;
                } else if (importence1 < importence2) {
                    return -1;
                } else {
                    return 0;
                }
            }
            return 0;
        }
    }

    public void sortByImportanceSourceDate() {
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        Arrays.sort(this.records, new ByImportance().thenComparing(new BySource()).thenComparing(new ByDate()));
    }

    class BySource implements Comparator<Record2> {
        @Override
        public int compare(Record2 obj1, Record2 obj2) {
            if (obj1 != null && obj2 != null) {
                String source1 = obj1.getSource();
                String source2 = obj2.getSource();
                return source1.compareTo(source2);
            }
            return 0;
        }
    }

    public void sortBySourceDate() {
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        Arrays.sort(this.records, new BySource().thenComparing(new ByDate()));
    }

    @Override
    public String toString() {
        return "Journal{" +
                "includes " + count +
                " records="
                + "\n_______Date______+Importance+Source+Message"
                + Arrays.toString(records) +
                '}';

    }
}
