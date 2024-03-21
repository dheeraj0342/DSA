package GLA.CodeForces;

import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        int[] arr = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <b ; i++) {
            ans += arr[i-1];
        }
        System.out.println(ans);
    }
}
