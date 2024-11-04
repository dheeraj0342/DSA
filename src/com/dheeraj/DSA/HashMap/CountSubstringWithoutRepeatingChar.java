package com.dheeraj.DSA.HashMap;

import java.util.HashMap;

public class CountSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        System.out.println(solution("ABC"));
    }
    public static int solution(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        int i=-1;
        int j=-1;
        int ans =0;
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            while(i< str.length()-1){
                i++;
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)==2){
                    break;
                }else{
                    ans += i-j;
                }
                f1 = true;
            }
            while(j<i){
                j++;
                char ch = str.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)==1){
                   ans+= i-j;
                    break;
                }
                f2 = true;
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
    }
}
