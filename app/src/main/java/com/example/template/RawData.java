package com.example.template;

import java.util.ArrayList;

public class RawData {

    public void fillArrayList(ArrayList<ArrayList<Integer>> array) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        fillArray(a1);
        for (int i = 0; i < 5; i++) {
            array.add(a1);
        }
    }
    public void fillArray(ArrayList<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
