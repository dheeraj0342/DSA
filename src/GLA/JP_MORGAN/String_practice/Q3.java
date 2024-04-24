package GLA.JP_MORGAN.String_practice;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();
        int dp[] = new int[len+1];
        dp[0] = 1;
        dp[1] = st.charAt(0) =='0' ? 0 : 1;
        for (int i = 2; i <=len ; i++) {
            int oneDigit =Integer.valueOf(st.substring(i-1,i));
            int TwoDigit = Integer.valueOf(st.substring(i-2,i));
            if(oneDigit >=1){
                dp[i] += dp[i-1];
            }
            if(TwoDigit >= 10 && TwoDigit<=26){
                dp[i] += dp[i-2];
            }
        }
        System.out.println(dp[len]);
    }
}
