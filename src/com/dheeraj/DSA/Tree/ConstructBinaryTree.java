package com.dheeraj.DSA.Tree;

import java.util.Stack;

public class ConstructBinaryTree {
    public static class Node{
        Integer data;
        Node left;
        Node right;

        Node(Integer data,Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        Node node;
        int state;

        Pair(Node node , int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root = new Node(arr[0],null,null);
        construct(root,arr);
        System.out.println(VerticalOrdering.verticalOrdering(root));

        }
    public static void construct(Node root,Integer[] arr) {
        Stack<Pair> st = new Stack<>();
        Pair rp = new Pair(root, 0);
        st.push(rp);
        int idx = 0;
        while (!st.isEmpty()) {
            Pair top = st.peek();
            if (top.state == 0) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    st.push(new Pair(top.node.left, 0));
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    st.push(new Pair(top.node.right, 0));
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }
    }


    public static void display(Node root){
        if(root ==null){
            return;
        }
        String string = "";
        string += root.left==null ? "null" : root.left.data + "";
        string += "<-"+ root.data + "->";
        string += root.right==null ? "null" : root.right.data + "";
        System.out.println(string);
        display(root.left);
        display(root.right);
    }

    public static int sum(Node root){
        if(root==null)
            return 0;
        int ls=sum(root.left);
        int rs = sum(root.right);
        int ts = ls + rs + root.data;
        return ts;
    }

    public static int size(Node root){
        if(root==null)
            return 0;
        int ls = size(root.left);
        int rs = size(root.right);
        int ts = ls + rs + 1;
        return ts;
    }

    public static int max(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        int lm = max(root.left);
        int rm = max(root.right);
        return Math.max(root.data,Math.max(lm,rm));
    }
    public static int height(Node root){
        if(root==null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
}
