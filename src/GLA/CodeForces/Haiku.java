package GLA.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Haiku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[3];
        for (int i = 0; i < 3; i++) {
            words[i] = sc.nextLine();
        }
        int[] ans = new int[3];
        for (int i = 0; i < words.length; i++) {
            String newSt = words[i].trim().toLowerCase();
            int cnt = 0;
            for (int j = 0; j < newSt.length(); j++) {
                if (newSt.charAt(j) == 'a' || newSt.charAt(j) == 'e' || newSt.charAt(j) == 'i' || newSt.charAt(j) == 'o' || newSt.charAt(j) == 'u') {
                    cnt++;
                }
            }
            ans[i] = cnt;

        }
        if (ans[0] == 5 && ans[1] == 7 && ans[2] == 5)
            System.out.println("YES");

        else
            System.out.println("NO");
    }



}
