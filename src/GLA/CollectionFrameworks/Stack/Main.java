package GLA.CollectionFrameworks.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println("peek: "+st.peek());
        System.out.println("pop: "+st.pop());
        System.out.println("Size: "+st.size());
    }
}
