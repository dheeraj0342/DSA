package GLA.CodeForces;

import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n % 2==0 && n !=2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
