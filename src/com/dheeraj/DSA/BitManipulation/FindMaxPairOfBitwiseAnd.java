package com.dheeraj.DSA.BitManipulation;

public class FindMaxPairOfBitwiseAnd {
    public static void main(String[] args) {
        int [] arr ={26,13,23,28,27,7,25};
        int n = arr.length;
        int ans=0;
        for(int i=31;i>=0;i--){
            int cnt=0;
            for(int j=0;j<n;j++){
                cnt += (arr[j]>>i & 1);

            }
            if(cnt>=2){
                ans |= (1<<i);
                for(int j=0;j<n;j++){
                    if((arr[j]>>i & 1) == 0){
                        arr[j]=0;
                    }
                }
            }

        }
        System.out.println(ans);
    }
}
