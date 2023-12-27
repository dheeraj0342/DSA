package com.dheeraj.DSA.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class CustomKey {
    public static class coordinate{
        private int x;
        private int y;
        private int hashcode;

        coordinate(int x , int y){
            this.x = x;
            this.y =y;
            this.hashcode = Objects.hash(x,y);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            coordinate that = (coordinate) o;
            return x == that.x && y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "coordinate{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static void main(String[] args) {
        HashSet<coordinate> hs = new HashSet<>();
        hs.add(new coordinate(1,2));
        hs.add(new coordinate(2,1));
        hs.add(new coordinate(1,2));

        System.out.println(hs);
    }
}
