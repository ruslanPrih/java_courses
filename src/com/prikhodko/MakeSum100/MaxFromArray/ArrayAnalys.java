package com.prikhodko.MakeSum100.MaxFromArray;

import java.util.ArrayList;

class ArrayAnalis {
    public <T extends Comparable> T FindMax(ArrayList<T> arr) {
        T maxFromArray = arr.get(0);
        for (T e : arr
                ) {
            if (e.compareTo(maxFromArray) > 0) maxFromArray = e;
        }
        return maxFromArray;
    }
}
