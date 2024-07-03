package com.dheeraj.DSA.Arrays;

import java.util.ArrayList;
import java.util.Collection;


public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.remove(list.size()-1);
        System.out.println(list);
    }
}
