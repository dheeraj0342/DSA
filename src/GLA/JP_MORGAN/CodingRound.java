package GLA.JP_MORGAN;

import java.util.Scanner;

public class CodingRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = n-1; i >=0 ; i--) {
            if(i +k <n)
                sum = arr[i+k] + arr[i];
            else
                sum = arr[i];
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }

}
