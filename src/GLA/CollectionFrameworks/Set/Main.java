package GLA.CollectionFrameworks.Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // order does not maintained
        set.add(10);
        set.add(20);
        System.out.println(set);

        Set<Integer> set2 = new LinkedHashSet<>(); // order is maintained
        set2.add(10);
        set2.add(0);
        set2.add(1);
        System.out.println(set2);

        List<Integer> list = new ArrayList<>(set); // coverting set into list
        System.out.println(list);

    }
}
