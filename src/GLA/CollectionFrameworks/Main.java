package GLA.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("Mango");
        System.out.println(list);

        String [] arr = {"Apple","Banana","Dragon Fruit"};
        for(String i : arr){
            list.add(i);
        }
        System.out.println(list);

        list.set(2,"Grapes");
        System.out.println(list);

        List<String> sublist = list.subList(1,2);
        System.out.println(sublist);



    }
}
