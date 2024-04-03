package GLA.CodeForces;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String st1 ="aabc";
        String st2 = "abad";
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if(st1.length()!= st2.length()){
            System.out.println("NO");
            return;
        }
        for(int i=0;i<st1.length();i++){
            if(map.containsKey(st1.charAt(i))) {
                int val = map.get(st1.charAt(i))+1;
                map.put(st1.charAt(i), val);
            }
            else{
                map.put(st1.charAt(i),1);
            }
            if(map2.containsKey(st2.charAt(i))) {
                int val = map2.get(st2.charAt(i))+1;
                map2.put(st2.charAt(i), val);
            }
            else{
                map2.put(st2.charAt(i),1);
            }

        }
        boolean flag= false;
        for (int i = 0; i < st1.length(); i++) {
                if(map.get(st1.charAt(i))!=map2.get(st1.charAt(i))){
                    System.out.println("NO");
                    flag = true;
                    break;
                }
        }
        if(!flag){
            System.out.println("YES");
        }



    }
}
