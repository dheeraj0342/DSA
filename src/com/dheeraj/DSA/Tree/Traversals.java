package com.dheeraj.DSA.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Traversals {
    public static class Node{
        Integer data;
       Node left;
        Node right;

        Node(Integer data,Node left, Node right){
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
        Stack<Pair> st = new Stack<>();
        Pair rp = new Pair(root,0);
        st.push(rp);
        int idx=0;
        while(!st.isEmpty()){
            Pair top = st.peek();
            if(top.state ==0){
                idx++;
                if(arr[idx] != null){
                    top.node.left = new Node(arr[idx],null,null);
                    st.push(new Pair(top.node.left,0));
                }else{
                    top.node.left =null;
                }
                top.state++;
            } else if (top.state==1) {
                idx++;
                if(arr[idx] !=null){
                    top.node.right = new Node(arr[idx],null,null);
                    st.push(new Pair(top.node.right,0));
                }else{
                    top.node.right=null;
                }
                top.state++;
            }else{
                st.pop();
            }
        }
        postOrder(root);
        System.out.println();
        IpostOrder(root);
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

    public static void postOrder(Node root){
        if(root==null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static void preOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        String lvlorder="";
        while(q.size()>0){
            int cnt =q.size();
            for (int i=0;i<cnt;i++){
                root = q.remove();
                lvlorder+= root.data+" ";
                if(root.left!=null)
                    q.add(root.left);
                if(root.right!= null)
                    q.add(root.right);
            }
        }
        System.out.println(lvlorder);

    }

    // iterative Traversal

    public static void IpreOrder(Node root){
        Pair rp = new Pair(root,0);
        Stack<Pair> st = new Stack<>();
        st.push(rp);
        String preOrder ="";
        while(st.size()>0){
            Pair top = st.peek();
            if(top.state==0){
                preOrder += top.node.data+ " ";
                top.state++;
                if(top.node.left!=null){
                    st.push(new Pair(top.node.left,0));
                }
            } else if (top.state==1) {
                if(top.node.right!=null){
                    st.push(new Pair(top.node.right,0));
                }
                top.state++;
            }else{
                st.pop();
            }
        }
        System.out.println(preOrder);
    }

    public static void IpostOrder(Node root){
        Pair rp = new Pair(root,0);
        Stack<Pair> st = new Stack<>();
        st.push(rp);
        String postOrder ="";
        while(st.size()>0){
            Pair top = st.peek();
            if(top.state==0){
                top.state++;
                if(top.node.left!=null){
                    st.push(new Pair(top.node.left,0));
                }
            } else if (top.state==1) {

                if(top.node.right!=null){
                    st.push(new Pair(top.node.right,0));
                }
                top.state++;
            }else{
                postOrder += top.node.data+ " ";
                st.pop();
            }
        }
        System.out.println(postOrder);
    }

    public static void IinOrder(Node root){
        Pair rp = new Pair(root,0);
        Stack<Pair> st = new Stack<>();
        st.push(rp);
        String inOrder ="";
        while(st.size()>0){
            Pair top = st.peek();
            if(top.state==0){

                top.state++;
                if(top.node.left!=null){
                    st.push(new Pair(top.node.left,0));
                }
            } else if (top.state==1) {
                inOrder += top.node.data+ " ";
                if(top.node.right!=null){
                    st.push(new Pair(top.node.right,0));
                }
                top.state++;
            }else{
                st.pop();
            }
        }
        System.out.println(inOrder);
    }
}
