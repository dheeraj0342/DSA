package com.dheeraj.DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    TreeNode root;
    public void levelOrderInsertion(int data){
        TreeNode newNode = new TreeNode(data);
        if(root == null){
            root = newNode;
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(true){
            TreeNode temp = queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            else{
                temp.left= newNode;
                break;
            }

            if(temp.right!=null){
                queue.offer(temp.right);
            }
            else{
                temp.right=newNode;
                break;
            }
        }
    }

    public void levelOrderTreverse(){
        if(root==null)
            return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }

    public void PreOrderTreverse(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.val);
        PreOrderTreverse(root.left);
        PreOrderTreverse(root.right);
    }

    public void InOrderTreverse(TreeNode root){
        if(root==null)
            return;
        InOrderTreverse(root.left);
        System.out.print(root.val);
        InOrderTreverse(root.right);
    }


    public void PostOrderTreverse(TreeNode root){
        if(root==null)
            return;
        PostOrderTreverse(root.left);
        PostOrderTreverse(root.right);
        System.out.print(root.val);
    }

    public int height(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    public int countNode(TreeNode root){
        if(root==null)
            return 0;
        return countNode(root.left) + countNode(root.right) +1;
    }

    public int countLeafNode(TreeNode root){
        if(root ==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        return countLeafNode(root.left) + countLeafNode(root.right);
    }

    public boolean isBalanced(TreeNode root){
        if(root==null)
            return true;
        return Math.abs(height(root.left)-height(root.right)) <=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public boolean search(TreeNode root , int val){
        if(root == null)
            return false;
        if(root.val== val )
            return true;
        return search(root.left,val) || search(root.right,val);
    }
}
