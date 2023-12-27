package com.dheeraj.DSA.String;

public class Main {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        // both s1 and s2 pointing to same object
        System.out.println(s1 == s2);

        String a = new String("hello");
        String b = new String("hello");
        // here a and b pointing to different object

        System.out.println(a == b);


        // String built-In methods:

        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toCharArray());
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.replace("h","b"));
        System.out.println(s1.trim());
        System.out.println(s1.startsWith("h"));
        System.out.println(s1.endsWith("e"));
        System.out.println(s1.stripLeading());

    }
}
