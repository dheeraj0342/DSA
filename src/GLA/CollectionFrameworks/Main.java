package GLA.CollectionFrameworks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String > list = new ArrayList<>();
//        list.add("Mango");
//        System.out.println(list);
//
//        String [] arr = {"Apple","Banana","Dragon Fruit"};
//        for(String i : arr){
//            list.add(i);
//        }
//        System.out.println(list);
//
//        list.set(2,"Grapes");
//        System.out.println(list);
//
//        List<String> sublist = list.subList(1,2);
//        System.out.println(sublist);

        List<Integer> list = Arrays.asList(12,34,56,78,90,23,67);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));



    }
}
