package GLA.DataStructure.Stack;

import java.util.Stack;

public class InfixToPostfix {

    public static boolean isOperator(char ch){
        return ch=='+' || ch =='-' || ch=='*' || ch =='/';
    }

    public static int precedence(char ch){
        if(ch=='+' || ch=='-')
            return 1;
        else if(ch=='*' || ch=='/'){
            return 2;
        }
        return -1;
    }

    public static String infixToPostfix(String st){
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char ch : st.toCharArray()) {
            if (Character.isLetterOrDigit(ch))
                postfix.append(ch);

            else if (ch == '(')
                stack.push(ch);
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
            while (!stack.isEmpty()) {
                postfix.append(stack.pop());
            }


            return postfix.toString();
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("A+B*(C+D)/E"));
    }
}
