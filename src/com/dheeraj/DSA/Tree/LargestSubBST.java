package com.dheeraj.DSA.Tree;

public class LargestSubBST {
    static class Pair{
        int min;
        int max;
        boolean isBst;
        ConstructBinaryTree.Node root;
        int size;
    }
    public static Pair largestSubBST(ConstructBinaryTree.Node root){
        if(root ==null){
            Pair bp = new Pair();
            bp.min = Integer.MAX_VALUE;
            bp.max= Integer.MIN_VALUE;
            bp.size =0;
            bp.isBst = true;
            bp.root = null;
            return bp;
        }
        Pair lp = largestSubBST(root.left);
        Pair rp = largestSubBST(root.right);
        Pair np = new Pair();
        np.isBst = lp.isBst && rp.isBst &&(root.data >=lp.max && root.data <=rp.min);
        np.min = Math.min(root.data,Math.min(lp.min,rp.min));
        np.max =Math.max(root.data,Math.max(lp.max,rp.max));
        if(np.isBst){
            np.root = root;
            np.size =lp.size + rp.size +1;
        } else if (lp.size > rp.size) {
            np.root = lp.root;
            np.size = lp.size;
        }else{
            np.root = rp.root;
            np.size = rp.size;
        }
        return np;
    }
}
