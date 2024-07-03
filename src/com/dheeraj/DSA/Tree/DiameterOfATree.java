package com.dheeraj.DSA.Tree;

public class DiameterOfATree {
    public static void main(String[] args) {

    }

    // TIme Complexcity : O(N^2)
    public static int diameterOfTree(ConstructBinaryTree.Node root){
        if(root==null)
            return 0;
        int ld = diameterOfTree(root.left);
        int rd = diameterOfTree(root.right);
        int fact = ConstructBinaryTree.height(root.left) + ConstructBinaryTree.height(root.right) +2;
        return Math.max(fact,Math.max(ld,rd));
    }

    static class Pair{
        int dia;
        int height;
    }

    public static Pair diameterOfTree2(ConstructBinaryTree.Node root){
        if(root ==null){
         Pair p = new Pair();
         p.height=-1;
         p.dia=0;
         return p;
        }
        Pair lp = diameterOfTree2(root.left);
        Pair rp = diameterOfTree2(root.right);
        int fact = lp.height + rp.height +2;
        Pair np = new Pair();
        np.height = Math.max(lp.height,rp.height)+1;
        np.dia = Math.max(fact , Math.max(lp.dia,rp.dia));
        return np;

    }
}
