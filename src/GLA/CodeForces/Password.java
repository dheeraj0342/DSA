package GLA.CodeForces;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        boolean hasCapital=false;
        boolean hasSmall=false;
        boolean hasDigit=false;
        boolean hasChar=false;
        String characters ="!.,?_";
        for(char ch : st.toCharArray()){
            if(Character.isDigit(ch))
                hasDigit = true;
            if(Character.isUpperCase(ch))
                hasCapital=true;
            if(Character.isLowerCase(ch))
                hasSmall=true;
            if(characters.contains(String.valueOf(ch)))
                hasChar = true;

        }
        if(hasDigit && hasChar && hasCapital && hasSmall){
            System.out.println("Correct");
        }
        else{
            System.out.println("Too weak");
        }

    }
}
