package GLA.DataStructure.Stack;

import java.util.Stack;

public class EvaluatePrefix {

    public static void main(String[] args) {
        System.out.println(evaluatePrefix("+-234"));
    }

    public static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/';
    }
    public static int operation(char ch , int val1 , int val2){
        if(ch =='+')
            return val1 + val2;
        if(ch =='-')
            return val1 - val2;
        if(ch =='*')
            return val1 * val2;

        return val1 / val2;
    }
    public static int evaluatePrefix(String st){

        Stack<Integer> stack = new Stack();
        for(int i = st.length()-1;i>=0;i--){
            char ch = st.charAt(i);
            if(!isOperator(ch)){
                int val = ch-48;
                stack.push(val);
            }
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                int ans = operation(ch,val1,val2);
                stack.push(ans);
            }
        }
        return stack.pop();
    }
}
