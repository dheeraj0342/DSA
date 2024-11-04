package com.dheeraj.DSA.HashMap;

public class onesII {
    public static void main(String[] args) {

    }
    public static int solution(int[] arr){
        int j=-1;
        int cnt=0;
        int ans=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                cnt++;
            }
            while(cnt > 1){
                j++;
                if(arr[j]==0)
                    cnt--;
            }
            ans = Math.max(ans,i-j);
        }
        return ans;
    }
}
