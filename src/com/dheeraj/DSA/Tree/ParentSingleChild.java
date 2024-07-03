package com.dheeraj.DSA.Tree;

public class ParentSingleChild {
    public static void parentSingleChild(ConstructBinaryTree.Node root , ConstructBinaryTree.Node parent){
        if(root==null)
            return;
        if(parent != null && parent.left ==root && parent.right==null)
            System.out.print(root.data);
        else if (parent != null && parent.left == null && parent.right == root) {
            System.out.print(root.data);
        }
        parentSingleChild(root.left,root);
        parentSingleChild(root.right,root);
    }
}
