package com.example.template;

import java.util.ArrayList;

public class RawData {

    public void fillArrayList(ArrayList<ArrayList<Integer>> array) {
        ArrayList<Integer> a1 = fillArray(new ArrayList<Integer>());
        for (int i = 0; i < 5; i++) {
            array.add(a1);
        }
    }
    public ArrayList<Integer> fillArray(ArrayList<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }
}
