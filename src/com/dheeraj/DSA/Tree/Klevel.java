package com.dheeraj.DSA.Tree;

public class Klevel {
    public static void klvl(ConstructBinaryTree.Node root , int k){
        if(root==null || k<0)
            return;
        if(k==0){
            System.out.print(root.data+" ");
        }
        klvl(root.left,k-1);
        klvl(root.right,k-1);

    }
}
