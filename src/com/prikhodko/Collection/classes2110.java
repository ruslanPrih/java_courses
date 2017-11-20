package com.prikhodko.Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class classes2110 {
    public static  void main (String args[]) {
        List<Integer> list = new LinkedList();
        Random r= new Random();
        for (int i=0; i<30;i++){
            list.add(r.nextInt(100));
        }
        System.out.println(list.toString());
        ListIterator<Integer> iterator = list.listIterator();
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int temp;

            while (iterator.hasNext()) {
                temp=iterator.next();
                if (min > temp) {
                    min = temp;
                }
                if (max < temp) {
                    max = temp;
                }
                System.out.println(temp);
            }
            System.out.println("min "+min);
            System.out.println("max "+max);

        while (iterator.hasPrevious()) {
            //iteratorL.previous();
            System.out.println(iterator.previous());
        }

    }
}
