package com.prikhodko.testTask2907;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
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
    /**
     * Add records
     */
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
    /**
     * Remove records
     */
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
    /**
     * Filter Journal
     */
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
            Date date = format.parse(this.records[i].toString().substring(0, 20));
            if (date.after(fromDate) && date.before(toDate)) {
                result[counter] = records[i];
                counter++;
            }
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
        Arrays.sort(this.records, new Comparator<Record>() {
                    @Override
                    public int compare(Record obj1, Record obj2) {
                        if (obj1 != null && obj2 != null) {
                            String dateString1 = obj1.toString().substring(0, 20);
                            String dateString2 = obj2.toString().substring(0, 20);
                            return dateString1.compareTo(dateString2);
                        }
                        return 0;
                    }
                }
        );
    }


    public void sortByImportanceDate() {
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        Arrays.sort(this.records, new Comparator<Record>() {
                    @Override
                    public int compare(Record obj1, Record obj2) {
                        if (obj1 != null && obj2 != null) {
                            int importence1 = FindImportanceIndex(obj1.toString().substring(20).trim().substring(0, 5));
                            int importence2 = FindImportanceIndex(obj2.toString().substring(20).trim().substring(0, 5));

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
                }.thenComparing(new Comparator<Record>() {
                    @Override
                    public int compare(Record obj1, Record obj2) {
                        if (obj1 != null && obj2 != null) {
                            String dateString1 = obj1.toString().substring(0, 19);
                            String dateString2 = obj2.toString().substring(0, 19);
                            return dateString1.compareTo(dateString2);
                        }
                        return 0;
                    }

                })
        );
    }

    public void sortByImportanceSourceDate() {
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        Arrays.sort(this.records, new Comparator<Record>() {
                    @Override
                    public int compare(Record obj1, Record obj2) {
                        if (obj1 != null && obj2 != null) {
                            int importence1 = FindImportanceIndex(obj1.toString().substring(20).trim().substring(0, 5));
                            int importence2 = FindImportanceIndex(obj2.toString().substring(20).trim().substring(0, 5));

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
                }.thenComparing(new Comparator<Record>() {
                    @Override
                    public int compare(Record obj1, Record obj2) {
                        if (obj1 != null && obj2 != null) {
                            String source1 = obj1.toString().substring(20).trim().substring(5).trim().substring
                                    (0, obj1.toString().substring(20).trim().substring(5).trim().indexOf(" "));
                            String source2 = obj2.toString().substring(20).trim().substring(5).trim().substring
                                    (0, obj2.toString().substring(20).trim().substring(5).trim().indexOf(" "));
                            return source1.compareTo(source2);
                        }
                        return 0;
                    }
                }).thenComparing(new Comparator<Record>() {
                    @Override
                    public int compare(Record obj1, Record obj2) {
                        if (obj1 != null && obj2 != null) {
                            String dateString1 = obj1.toString().substring(0, 20);
                            String dateString2 = obj2.toString().substring(0, 20);
                            return dateString1.compareTo(dateString2);
                        }
                        return 0;
                    }

                })
        );
    }

    public void sortBySourceDate(){
        if (this == null)
            throw new IllegalArgumentException("Data cant be null!");
        Arrays.sort(this.records, new Comparator<Record>() {
            @Override
            public int compare(Record obj1, Record obj2) {
                if (obj1 != null && obj2 != null) {
                    String source1 = obj1.toString().substring(20).trim().substring(5).trim().substring
                            (0, obj1.toString().substring(20).trim().substring(5).trim().indexOf(" "));
                    String source2 = obj2.toString().substring(20).trim().substring(5).trim().substring
                            (0, obj2.toString().substring(20).trim().substring(5).trim().indexOf(" "));
                    return source1.compareTo(source2);
                }
                return 0;
            }
        }.thenComparing(new Comparator<Record>() {
            @Override
            public int compare(Record obj1, Record obj2) {
                if (obj1 != null && obj2 != null) {
                    String dateString1 = obj1.toString().substring(0, 20);
                    String dateString2 = obj2.toString().substring(0, 20);
                    return dateString1.compareTo(dateString2);
                }
                return 0;
            }
                })
        );
    }

    @Override
    public String toString() {
        return "Journal{" +
                "count=" + count +
                ", records="
                + "\n_______Date______+Importance+Source+Message"
                + Arrays.toString(records) +
                '}';
    }
}
