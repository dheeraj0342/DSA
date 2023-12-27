package com.dheeraj.DSA.SubArrays;

import java.util.HashMap;

public class sumzeroLength {
    public static void main(String[] args) {
        int [] arr={-3};
        System.out.println(sumzerolength(arr));
    }
    public static int sumzerolength(int []arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        int currsum =0;
        int maxlen =0;
        map.put(currsum , -1);
        for(int i=0;i<arr.length;i++){
            currsum +=arr[i];
            if(map.containsKey(currsum)){
              int len = i-map.get(currsum);
              maxlen = Math.max(len,maxlen);
            }
            else{
                map.put(currsum,i);
            }
        }
        return maxlen;

    }

}
