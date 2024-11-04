package com.dheeraj.DSA.HashMap;

import java.util.HashMap;

public class CountOfSubstringAtMost_K_char {
    public static void main(String[] args) {

    }
    public static int solution(String str , int k){
        int ans =0;
        int i=-1;
        int j=-1;
        HashMap<Character,Integer> map = new HashMap<>();
        while(true){
            while(i<str.length()-1){
                i++;
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.size()<=k){
                    ans += i-j;
                }else{
                    break;
                }
            }
            if(i==str.length()-1 && map.size()<=k){
                break;
            }
            while(j<i){
                j++;
                char ch = str.charAt(j);
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }if(map.size()>k){
                    continue;
                }else{
                    ans += i-j;
                }
            }
        }
        return ans;

    }
}
