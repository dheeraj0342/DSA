package GLA.CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = new String[3];
        String f = sc.next();
        String m = sc.next();
        String s = sc.next();
        HashMap<String,String> map = new HashMap<>();
        map.put("rock","scissors");
        map.put("scissors","paper");
        map.put("paper","rock");
        if(!f.equals(m) && !m.equals(s) && !s.equals(f)){
            System.out.println('?');

        } else if (map.get(f).equals(m) && map.get(f).equals(s)) {
            System.out.println('F');

        }
        else if (map.get(m).equals(f) && map.get(m).equals(s)) {
            System.out.println('M');

        }
        else if (map.get(s).equals(m) && map.get(s).equals(f)) {
            System.out.println('S');

        }
        else{
            System.out.println('?');
        }
    }
}
