package GLA.AdventOfCode;

import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
        try {
            int n = Integer.parseInt(input);
            if (n < 0) {
                throw new Exception("Invalid number");
            }
            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (Exception e) {
            System.out.println("Invalid number");
        }
    }
}
