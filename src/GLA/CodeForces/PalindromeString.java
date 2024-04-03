package GLA.CodeForces;

public class PalindromeString {
    public static void main(String[] args) {
        String st = "dheeraj";
        int i=0;
        int j= st.length()-1;
        while(i<j){
            if(st.charAt(i)==st.charAt(j)){
                i++;
                j--;
            }
            else{
                break;
            }
        }
        if(i>=j){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
