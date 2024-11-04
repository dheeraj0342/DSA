package com.dheeraj.DSA.HashMap;

import java.util.HashMap;

public class Route {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","b");
        map.put("b","c");
        map.put("c","d");
        map.put("d","e");

        HashMap<String,Boolean> srcs = new HashMap<>();
        for(String src: map.keySet()){
            String dest = map.get(src);
            srcs.put(dest,false);
            if(srcs.containsKey(src)==false){
                srcs.put(src,true);
            }
        }
        String src="";
        for(String temp : srcs.keySet()){
            if(srcs.get(temp)==true){
                src = temp;
            }
        }

        while(true){
            if(map.containsKey(src)){
                System.out.print(src+"->");
                src = map.get(src);
            }else{
                System.out.println(src+".");
                break;
            }
        }
    }
}
