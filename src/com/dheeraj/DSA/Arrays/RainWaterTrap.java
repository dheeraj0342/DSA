package com.dheeraj.DSA.Arrays;

public class RainWaterTrap {
    public static void main(String[] args) {
    int [] arr = {6,4,3,5,1,7,3,5};
        System.out.println(solution1(arr));

        System.out.println(solution2(arr));
    }

    // using two arrays
    // Time complexity : O(N)
    // Space complexity : O(N)
    public static int solution1(int[] arr){
        int n = arr.length;
        int [] left = new int[n];
        int [] right = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        int water =0;
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--) {
            right[i] = Math.max(right[i +1], arr[i]);
        }
        for(int i=0;i<n;i++){
            water += Math.min(left[i],right[i]) - arr[i];
        }
        return water;
    }

    // using Two-pointer Technique
    // Time complexity:O(N)
    // Space complexity : O(1)
    public static int solution2(int[] arr){
        int n = arr.length;
        int left=0;
        int left_max =arr[0];
        int right =n-1;
        int right_max = arr[n-1];
        int ans =0;
        while (left <= right){
            if(arr[left] <= arr[right]){
                left_max = Math.max(left_max,arr[left]);
                ans += left_max - arr[left];
                left++;
            }
            else{
                    right_max = Math.max(right_max,arr[right]);
                    ans += right_max - arr[right];
                    right--;
            }
        }
        return ans;
    }

}
