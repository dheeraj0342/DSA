package GLA.JP_MORGAN;

import java.util.Arrays;
import java.util.Scanner;

public class MonsterGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int temp =k;
        int ans=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] && temp!=0){
                temp--;
            }
            else if(arr[i]==arr[i+1] && temp==0){
                temp =k;
                ans++;
            }
            else{
                ans++;
            }
        }
        System.out.println(ans);
    }
}
