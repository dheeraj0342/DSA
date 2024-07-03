package com.dheeraj.DSA.Tree;

public class LeftClone {
    public static void main(String[] args) {
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        ConstructBinaryTree.Node root = new ConstructBinaryTree.Node(arr[0],null,null);
        ConstructBinaryTree.construct(root,arr);
        ConstructBinaryTree.display(leftCloneTree(root));
    }
    public static ConstructBinaryTree.Node leftCloneTree(ConstructBinaryTree.Node root){

        if(root ==null)
            return null;
        ConstructBinaryTree.Node ln =leftCloneTree(root.left);
        ConstructBinaryTree.Node rn = leftCloneTree(root.right);

        ConstructBinaryTree.Node nn = new ConstructBinaryTree.Node(root.data,ln,null);
        root.left = nn;
        root.right = rn;

        return root;

    }
}
