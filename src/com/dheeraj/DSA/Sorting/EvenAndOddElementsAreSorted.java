package com.dheeraj.DSA.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenAndOddElementsAreSorted {
    public static void main(String[] args) {
        int [] arr ={3,9,2,4,15,10,19};
        int n = arr.length;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 ==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        int i=0,j=0,k=0;
        while(i<n){
            if(j== even.size()){
                arr[i] = odd.get(k);
                k++;
            }
            else if(even.get(j) < odd.get(k)){
                arr[i] = even.get(j);
                j++;
            }
            else if(k== odd.size()){
                arr[i] = even.get(j);
                j++;
            }
            else {
                arr[i] = odd.get(k);
                k++;
            }
            i++;

        }
        System.out.println(Arrays.toString(arr));

    }



}
