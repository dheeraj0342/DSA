package com.dheeraj.DSA.Tree;

public class TiltOfTree {
    static int tilt=0;
    public static int tiltOfTree(ConstructBinaryTree.Node root){
        if(root==null)
            return 0;
        int ls = tiltOfTree(root.left);
        int rs = tiltOfTree(root.right);
        tilt = Math.abs(rs-ls);
        return ls + rs + root.data;

    }
}
