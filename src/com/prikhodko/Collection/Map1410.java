package com.prikhodko.Collection;

import java.util.*;

public class Map1410 {
    public static void main(String args[]) {
/*
        // VASJA

                int[] ar = new int[100];

                Random r = new Random();

                for (int i = 0; i < ar.length; i++) {
                    ar[i] = r.nextInt(20);
                }
                System.out.println(Arrays.toString(ar));

                Map<Integer, Integer> map = new TreeMap<>();

                for (int i : ar) {
                    Integer count;
                    count = map.getOrDefault(i, 0);

                    map.put(i, ++count);
                }

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    System.out.println("Key= " + entry.getKey() + ", value= " + entry.getValue());
                }

                System.out.println(map);

*/


// MY BUT NOT COMPLITED
        Map<Integer, String> map = new TreeMap<>();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (i * Math.random());
        }
        System.out.println(Arrays.toString(arr));
        for (int e : arr
                )
            map.put(e, String.valueOf(e));
        System.out.println(map);
        System.out.println(map.size());

        Iterator <Map.Entry<Integer,String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }



/*
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        //Integer counter = 0;
        for (int i = 0; i < 10; i++) {
            map.put(1, 1);
            map.put(3, 1);
            map.put(6, 1);
            map.put(8, 1);
            map.put(2, 1);
            map.put(5, 1);
            map.put(7, 1);
            map.put(0, 1);
            map.put(9, 1);
            map.put(4, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key= " + entry.getKey() + ", value= " + entry.getValue());
        }

        System.out.println(map);
*/
    }
}
