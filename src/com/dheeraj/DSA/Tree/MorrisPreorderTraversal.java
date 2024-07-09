package com.dheeraj.DSA.Tree;

import java.util.ArrayList;
import java.util.List;

public class MorrisPreorderTraversal {
    public static void main(String[] args) {

    }

    public static List<Integer> morrisPreorderTraveral(ConstructBinaryTree.Node node){
        List<Integer> ans = new ArrayList<>();
        ConstructBinaryTree.Node curr = node;
        while(curr != null){
            ConstructBinaryTree.Node leftNode = curr.left;
            if(leftNode==null){
                ans.add(curr.data);
                curr = curr.right;
            }else{
                ConstructBinaryTree.Node rightMostNode = getRightMostNode(leftNode,curr);
                if(rightMostNode.right==null){
                    ans.add(curr.data);
                    rightMostNode.right = curr;
                    curr = curr.left;
                }else{
                    rightMostNode.right = null;
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
    public static ConstructBinaryTree.Node getRightMostNode(ConstructBinaryTree.Node leftNode, ConstructBinaryTree.Node curr){
        while(leftNode.right !=null || leftNode.right !=curr){
            leftNode.right=leftNode;
        }
        return leftNode;
    }
}
