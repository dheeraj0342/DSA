package GLA.CodeForces;

import java.util.Scanner;

public class AlmostPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        for(int i=6;i<=n;i++){
            int cnt=0;
            int prev =1;
            for(int j=2;j<=i;j++){
                int k =i;
                while(k % j==0 && (k !=1)){
                    k/=j;
                    if(isPrime(j) && prev !=j){
                        cnt++;
                        prev =j;
                    }
                }
            }
            if(cnt ==2){
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n % i==0){
                return false;
            }

        }
        return true;
    }
}
