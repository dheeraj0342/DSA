package GLA.JP_MORGAN.String_practice;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1= sc.next();
        String st2 = sc.next();
        String st = st1 + st1;
            if(st1.length()!= st2.length()){
                System.out.println("NO");
                return;
            }
            if(st.contains(st2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

