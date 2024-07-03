package com.dheeraj.DSA.Tree;

public class BackFromLeftClone {

    public static ConstructBinaryTree.Node backFromLeftClone(ConstructBinaryTree.Node root){
        if(root ==null)
            return null;
        ConstructBinaryTree.Node ln = backFromLeftClone(root.left.left);
        ConstructBinaryTree.Node rn = backFromLeftClone(root.right);
        root.left = ln;
        root.right = rn;
        return root;
    }
}
