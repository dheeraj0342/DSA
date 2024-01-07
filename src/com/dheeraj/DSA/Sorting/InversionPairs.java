package com.dheeraj.DSA.Sorting;

public class InversionPairs {
    public static void main(String[] args) {
        int [] arr = {1,2,0};
        int ans = InversionPairs(arr,0,arr.length-1);
        System.out.println(ans);

    }

    public static int  InversionPairs(int[] arr , int start,int end){
        int ans =0;
        if(end == start){
            return 0;
        }
        int mid = (start+end)/2;
        InversionPairs(arr,start,mid);
        InversionPairs(arr,mid+1,end);
        ans += merge(arr,start,mid,end);
        return ans;
    }

    public static int merge(int [] arr , int start,int mid , int end){
        int ans =0;
        int n = mid-start+1;
        int m = end - mid;
        int i=0,j=0;
        int [] left = new int[n];
        int [] right = new int[m];
        for (int k = 0; k < n; k++) {
            left[k] = arr[start+k];
        }
        for (int k = 0; k < m; k++) {
            right[k] = arr[mid+1+k];
        }
        int k = start;
        while(i<n && j<m){
            if(left[i]<right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
                ans += (n-i);
            }
            k++;
        }
        while(i<n){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = right[j];
            j++;
            k++;
            ans += (n-i);
        }
        return ans;
    }


}

