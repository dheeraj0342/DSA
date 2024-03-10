package GLA.DataStructure.Reccursion;

public class Recurrsion {

    public static void print(int x){
        if(x >0) print(x-1);
        System.out.println(x);
    }

    public static int fact(int num){
        if(num ==1)
            return 1;
        return num * fact(num-1);
    }

    public static String reverseString(String str){
        if(str.length()==0)
            return "";
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static int fibo(int num){
        if(num==0 || num==1)
            return num;
        return fibo(num-1) + fibo(num-2);
    }
    public static int sumOfNum(int num){
        if(num >=0 && num<=9){
            return num;
        }
        return (num %10) + (num/10);
    }

    public static boolean palindrome(String str){
        return  check(str,0,str.length()-1);
    }

    private static boolean check(String str , int i , int j){
        str =  str.toLowerCase();
        if(i>=j)
            return true;
        return str.charAt(i)==str.charAt(j) && check(str,i+1,j-1);
    }
    public static void main(String[] args) {

        System.out.println(sumOfNum(12));
        System.out.println(palindrome("Nitin"));
    }




}
