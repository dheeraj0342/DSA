package com.dheeraj.DSA.HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumSlidingWindow2 {
    public static void main(String[] args) {

    }
    public static int solution(String str){
        int len =Integer.MAX_VALUE;
        HashSet<Character> set =new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            set.add(ch);
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int i=-1;
        int j=-1;
        while(true){
            boolean flag1 = false;
            boolean flag2 = false;
            while(i<str.length()-1 && map.size() < set.size()){
                i++;
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                flag1 = true;
            }
            while(j<i && map.size()== set.size()){
                int plen = i-j;
                if(plen < len){
                    len = plen;
                }
                j++;
                char ch = str.charAt(j);
                if(map.get(ch)==1) {
                    map.remove(ch);
                }else{
                    map.put(ch,map.getOrDefault(ch,0)-1);
                }
                flag2 = true;
            }
            if(flag1==false && flag2 == false){
                break;
            }
        }
        return len;
     }
}
