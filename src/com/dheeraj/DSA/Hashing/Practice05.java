package com.dheeraj.DSA.Hashing;

import java.util.HashMap;

public class Practice05 {
    public static void main(String[] args) {
        int [] arr ={1,1,3,0,5,8,5};
        int k =4;
        approach(arr , k);

    }
    public  static  void approach(int[] arr ,int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i< k;i++){
            if(map.containsKey(arr[i])){
                int a = map.get(arr[i]);
                map.put(arr[i],a+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map.size());
        int j=0;
        for(int i=k;i<arr.length;i++){

                int frq = map.get(arr[j]);
                map.put(arr[j],frq-1);



            if(map.containsKey(arr[i])){
                int a = map.get(arr[i]);
                map.put(arr[i],a+1);
            }
            else{
                map.put(arr[i],1);
            }

            if(map.get(arr[j])==0){
                map.remove(arr[j]);
            }


            j++;
            System.out.println(map.size());

        }
    }
}
