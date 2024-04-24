package GLA.JP_MORGAN.String_practice;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) System.out.println("1");
        if(n==2) System.out.println("11");
        String st = "11";
        for(int i=3;i<=n;i++){
            String temp="";
            st = st + '&';
            int cnt=1;
            for(int j=1;j<st.length();j++){
                if(st.charAt(j) == st.charAt(j-1)){
                    cnt++;
                }else{
                    temp = temp +Integer.toString(cnt);
                    temp = temp + st.charAt(j-1);
                    cnt=1;
                }
            }
            st = temp;
        }
        System.out.println(st);

    }
}
