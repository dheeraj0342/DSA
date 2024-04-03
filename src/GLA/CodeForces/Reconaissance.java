package GLA.CodeForces;

import java.util.Scanner;

public class Reconaissance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int index1=0;
        int index2 =0;
        for(int i=0;i<n;i++){
            int nextIndex = (i+1)%n;
            int diff = Math.abs(arr[i]- arr[nextIndex]);
            if(diff < min){
                min = diff;
                index1 = i+1;
                index2 = nextIndex+1;
            }
        }

        System.out.println(index1+" "+index2);

    }
}
