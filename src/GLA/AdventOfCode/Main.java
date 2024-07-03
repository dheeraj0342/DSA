package GLA.AdventOfCode;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;
        int i;
        int powTen ;
        int sum=0;
        while(n >0){
            int num = n % 10;
            cnt++;
            i=1;
            powTen=1;
            while(i <= (num-1)){
                powTen *=10;
                i++;
            }
            sum = sum + cnt * powTen;
            System.out.println(sum);
            n/=10;
        }

        System.out.println(sum);
    }
}