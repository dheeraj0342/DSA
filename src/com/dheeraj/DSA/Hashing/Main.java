package com.dheeraj.DSA.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // uses wrapper classes for all primitives
        HashMap<String,Integer> menu = new HashMap<>();

        menu.put("momos" , 99);
        menu.put("burger", 49);
        menu.put("chaap",120);

        if(menu.containsKey("chaap")){
            System.out.println("available");
        }
        else{
            System.out.println("Out Of Stock");
        }

        menu.remove("burger");

        for(String key : menu.keySet()){
            System.out.println(key + " -> "  + menu.get(key));
        }
    }
    public static  void set(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        for(int s : set){
            System.out.println(s);
        }
    }
}
