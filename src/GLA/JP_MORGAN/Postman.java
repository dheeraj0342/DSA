package GLA.JP_MORGAN;

import java.util.Arrays;
import java.util.Scanner;

public class Postman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        System.out.println(Arrays.deepToString(arr));
        int[] ans =new int[row];
        int max=0;
        Arrays.fill(ans,0);
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                if(arr[i][1] > arr[j][1]){
                    ans[i]++;
                    max = Math.max(ans[i],max);
                }
            }
        }
        System.out.println(max);

    }
}
