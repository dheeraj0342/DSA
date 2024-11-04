package com.dheeraj.DSA.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterEleToRight {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        System.out.println(Arrays.toString(solution1(arr)));
        System.out.println(Arrays.toString(solution2(arr)));
    }
    public static int[] solution1(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        ans[arr.length-1] =-1;
        for (int i = arr.length-2;i>=0; i--) {
            while(st.size()>0 && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static int[] solution2(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size() >0 && arr[st.peek()] <= arr[i]){
                int pos = st.peek();
                ans[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            ans[st.peek()]=-1;
            st.pop();
        }

        return ans;
    }

}
