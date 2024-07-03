package com.dheeraj.DSA.Tree;

import java.util.ArrayList;

public class FindNode {
    public static void main(String[] args) {
        path = new ArrayList<>();
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        ConstructBinaryTree.Node root = new ConstructBinaryTree.Node(arr[0],null,null);
        ConstructBinaryTree.construct(root,arr);
        find(root,30);
        System.out.println(path);
    }
    static ArrayList<Integer> path;
    public static boolean find(ConstructBinaryTree.Node root ,int data){
        if(root==null)
            return false;
        if(root.data==data){
            path.add(root.data);
            return true;
        }

        boolean filc = find(root.left,data);
        if(filc){
            path.add(root.data);
            return true;
        }
        boolean firc = find(root.right,data);
        if(firc){
            path.add(root.data);
            return true;
        }
        return false;

    }
}
