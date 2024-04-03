package GLA.JP_MORGAN;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FootballMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int ans=0;
        while(n-i>0){
            n=n-i;
            i++;
        }
        if(n ==0){
            if(i % 2==0){
                ans = i;
            }
            else{
                ans = (i-1)*2;
            }
        }
        else{
            ans = (i-1)*2 + n*2;
        }
        System.out.println(ans);
    }
}

