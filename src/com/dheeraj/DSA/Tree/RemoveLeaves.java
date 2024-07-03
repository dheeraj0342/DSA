package com.dheeraj.DSA.Tree;

public class RemoveLeaves {
    public static ConstructBinaryTree.Node removeLeaves(ConstructBinaryTree.Node root){
        if(root==null)
            return null;
        if(root.left ==null && root.right==null)
            return null;
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
}
