package com.dheeraj.DSA.HashMap;

import java.util.HashMap;

public class LargestSubstringAtmost_K_chars {
    public static void main(String[] args) {

    }
    public static int solution(String st , int k){
        int ans =0;
        int i=-1;
        int j=-1;
        HashMap<Character, Integer> map = new HashMap<>();
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            while(i< st.length()-1){
                f1=true;
                i++;
                char ch = st.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.size()<=k){
                    int len = i-j;
                    if(len > ans){
                        ans = len;
                    }
                }else{
                    break;
                }
            }
            while(j<i){
                f2 = true;
                j++;
                char ch = st.charAt(j);
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
                if(map.size()>k){
                    continue;
                }else{
                    int len = i-j;
                    if(len > ans){
                        ans = len;
                    }
                    break;
                }
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
    }
}
