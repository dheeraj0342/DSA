package com.dheeraj.DSA.Recursion;

public class Practice {
    public static void main(String[] args) {

        System.out.println(getdigit(4,4));

    }
    public static int GoingInParty(int n){
        if(n==0 || n==1){
            return 1;
        }
        return GoingInParty(n-1) + (n-1)*GoingInParty(n-2);
    }

    // Magic Number Or Not :

    public static boolean isMagic(int n){
        if(n < 10){
            return n==1;
        }
        return isMagic(digitSum(n));
    }
    public static int  digitSum(int n){
        if(n==0){
            return 0;
        }
        return (n % 10 + digitSum(n/10));

    }

    // String 0 -> 01
    // 1 -> 10

    public static String generateString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='0'){
                sb.append("01");
            }
            else {
                sb.append("10");
            }
        }
        return sb.toString();
    }

    public static int ReturnChar(String s , int i , int A , int B){
        if(i==A){
            return (int) (s.charAt(i)-'0');
        }
        System.out.println(s);
        return ReturnChar(generateString(s),i+1,A,B);
    }
    // Get  Kth digit:

    public static int getdigit(int A, int B){
        if(A==1){
            return 0;
        }
        int len = (int) Math.pow(2,A-1);
        if(len/2 > B){
            return getdigit(A-1,B);
        }
        return ~ getdigit(A-1,B-len/2) +2;

    }
}
