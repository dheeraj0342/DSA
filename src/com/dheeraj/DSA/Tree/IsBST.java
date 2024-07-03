package com.dheeraj.DSA.Tree;

public class IsBST {

    static class BSTPair{
        boolean isBst;
        int min;
        int max;
    }
    public static BSTPair isBST(ConstructBinaryTree.Node root){

        if(root ==null){
            BSTPair bp = new BSTPair();
            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.isBst =true;
            return bp;
        }

        BSTPair lp = isBST(root.left);
        BSTPair rp = isBST(root.right);
        BSTPair np = new BSTPair();
        np.isBst = lp.isBst && rp.isBst && (root.data >= lp.max && root.data <= rp.min);
        np.min = Math.min(root.data,Math.min(lp.min,rp.min));
        np.max = Math.max(root.data,Math.max(lp.max,rp.max));
        return np;
    }
}
