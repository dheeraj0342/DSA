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
    // using Inorder :
    static ConstructBinaryTree.Node prev;
    public static boolean isBST2(ConstructBinaryTree.Node node){
        if(node==null) return true;
        if(!isBST2(node.left)) return false;
        if(prev !=null && prev.data > node.data) return false;
        prev = node;
        if(!isBST2(node.right)) return false;
        return true;
    }

    // Using MorrisInorderTraversal :
    public static boolean isBST3(ConstructBinaryTree.Node node){
        ConstructBinaryTree.Node curr = node;
        while(curr !=null){
            ConstructBinaryTree.Node leftNode = curr.left;
            if(leftNode ==null){
                if(prev !=null && prev.data >= curr.data) return false;
                prev = curr;
                curr = curr.right;
            }else {
                ConstructBinaryTree.Node rightMostNode = getRightMostNode(leftNode, curr);
                if (rightMostNode.right == null) {
                    rightMostNode.right = curr;
                    curr = curr.left;
                } else {
                    if (prev.data >= curr.data) return false;
                    rightMostNode.right = null;
                    prev = curr;
                    curr = curr.right;
                }
            }
        }
        return true;
    }
    public static ConstructBinaryTree.Node getRightMostNode(ConstructBinaryTree.Node leftNode , ConstructBinaryTree.Node curr){
        while(leftNode.right !=null && leftNode.right!=curr){
            leftNode=leftNode.right;
        }
        return leftNode;
    }

}
