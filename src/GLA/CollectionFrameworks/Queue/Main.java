package GLA.CollectionFrameworks.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.remove());


    }
}
