package GLA.JP_MORGAN;

import java.util.Scanner;

public class MysticalLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] magics = new int[n];
        int[] exilir = new int [n];
        for (int i = 0; i < n; i++) {
            magics[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            exilir[i] = sc.nextInt();
        }
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int count =0;
            for (int j = 0; j < n; j++) {
                count += Math.abs(magics[i]-magics[j])*(exilir[j]);
            }
            minCount= Math.min(minCount,count);
        }
        System.out.println(minCount);
    }
}
