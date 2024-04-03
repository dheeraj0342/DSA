package GLA.CodeForces;

import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q=0;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        for (int i = 0; i < primes.length; i++) {
            if(n < primes[i]){
               q=primes[i];
               break;
            }
        }
        if(q==m)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
