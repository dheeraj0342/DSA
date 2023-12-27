package com.dheeraj.DSA.StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Initial cap :" + sb.capacity());
        sb.append(" world");
        System.out.println(sb);

        System.out.println("Final cap :"+sb.capacity());

        System.out.println(sb.length());

        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
