package com.dheeraj.DSA.HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class NoOfEmpUnderEmp {
    public static void findCount(HashMap<String, String> map){

        HashMap<String, HashSet<String>> tree = new HashMap<>();
        HashMap<String,Integer> result = new HashMap<>();
        String ceo ="";
        for(String emp : map.keySet()){
            String man = map.get(emp);
            if(man.equals(emp)){
                ceo =man;
            }else{
                if(tree.containsKey(man)){
                    HashSet<String> emps = tree.get(man);
                    emps.add(emp);
                }else{
                    HashSet<String> emps = new HashSet<>();
                    emps.add(emp);
                    tree.put(man,emps);
                }
            }
        }
        getCount(tree,ceo,result);
        System.out.println(result);
    }
    public static int getCount(HashMap<String , HashSet<String >> tree , String man , HashMap<String ,Integer>result){
        if(tree.containsKey(man)==false){
            result.put(man,0);
            return 1;
        }
        int sz=0;
        for(String emp : tree.get(man)){
            sz += getCount(tree,emp,result);
        }
        result.put(man,sz);
        return sz+1;

    }

}
