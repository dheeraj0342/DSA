package GLA.AdventOfCode;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try{
            for(int i = 0;i<input.length();i++){
                char ch = input.charAt(i);
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                    System.out.print(ch);
                }
            }
        }catch (Exception e){
            System.out.println("Invalid Input");
        }

    }
}
