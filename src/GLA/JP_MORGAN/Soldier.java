package GLA.JP_MORGAN;

import java.util.Scanner;

public class Soldier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int fact1=1;
            for (int j = a; j >=1 ; j--) {
                fact1 *= j;
            }
            int fact2=1;
            for (int j = b; j >=1 ; j--) {
                fact2 *=j;
            }
            int n = fact1/fact2;
            int cnt=0;
            for(int j=2;j*j<=n;j++){
                if(n % j==0){
                    while(n%j==0){
                        cnt++;
                        n/=j;
                    }
                }
            }
            if(n!=1){
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
