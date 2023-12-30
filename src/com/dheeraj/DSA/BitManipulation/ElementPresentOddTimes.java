package com.dheeraj.DSA.BitManipulation;

public class ElementPresentOddTimes {
    public static void main(String[] args) {
        int [] arr = {9,2,2,2,4,4,4};
        int ans=0;
        for (int i = 0; i <= 31; i++) {
            int cnt=0;
            for (int j = 0; j < arr.length; j++) {
                cnt += (arr[j]>>i) & 1;
            }
            if(cnt % 3==1){
                ans |= (1<<i);
            }

        }
        System.out.println(ans);
    }
}
