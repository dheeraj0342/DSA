package GLA.CodeForces;

import java.util.Scanner;

public class Chips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chips = sc.nextInt();
        int sum = (n*(n+1))/2;
        chips = chips % sum;
        int i=1;
        while(chips-i>=0){
            chips-=i;
            i++;
        }
        System.out.println(chips);
    }
}
