package com.dheeraj.DSA.Sorting;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = {0,2,3,1};
        int[] temp = new int[arr.length];
        System.out.println(count(arr,temp,0 ,arr.length-1));
    }

    public static int count(int[] arr, int[] temp,int s, int e) {
        int ans=0;
        if (s==e)
            return 0;

        int m = (s + e) / 2;
        int l= count(arr,temp, s, m);
        int r= count(arr, temp,m+1, e);
        ans = l + r + merge(arr,temp, s, m+1, e);
        return ans ;

    }

    private static int merge(int[] arr,int []temp, int s, int m, int e) {
        int i = s;
        int j = m+1;
        int k = s;
        int cnt =0;
        while (i <=m & j <=e) {
            if (arr[i] <=arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
                cnt += m-i+1;
            }
            k++;
        }
        while (i <=m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <=e) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        return cnt;
    }
    public static int local(int[] arr){
        int cnt =0;
        for(int i=0;i<=arr.length-2;i++){
            if(arr[i]>arr[i+1])
                cnt++;
        }
        return cnt;
    }
}
