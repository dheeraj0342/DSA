package GLA.CodeForces;

import java.math.BigInteger;
import java.util.Scanner;

public class Threater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextInt();
        long ans=1;
        if(n % a==0)
            n/=a;
        else
            n= n/a +1;
        if(m % a==0)
            m/=a;
        else
            m = m/a +1;
        ans = n*m;
        System.out.println(ans);
    }
}
