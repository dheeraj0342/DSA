package com.dheeraj.DSA.Recursion;

public class PrintEncodings {
    public static void main(String[] args) {
        printEncodngs("123","");
    }
    public static void printEncodngs(String st , String res){
        if(st.length()==0){
            System.out.println(res);
            return;
        }else if(st.length()==1){
            char ch = st.charAt(0);
            if(ch=='0')
                return;
            else{
                int value = ch-'0';
                char code = (char)('a'+value-1);
                System.out.println(res+code);
            }
        }else{
            char ch1 = st.charAt(0);
            String rs1 = st.substring(1);
            if(ch1=='0')
                return;
            else{
                int value = ch1-'0';
                char code = (char) ('a'+value-1);
                printEncodngs(rs1,res+code);
            }
            String ch2 = st.substring(0,2);
            String rs2 = st.substring(2);
            int value = Integer.parseInt(ch2);
            if(value<=26){
                char code = (char)('a'+value-1);
                printEncodngs(rs2,res+code);
            }
        }
    }

}
