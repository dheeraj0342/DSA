package com.dheeraj.DSA.Tree;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        ConstructBinaryTree.Node root = new ConstructBinaryTree.Node(arr[0],null,null);
        ConstructBinaryTree.construct(root,arr);
        rootToLeafPath(root,ans,"");
        System.out.println(ans);


    }
    public static void rootToLeafPath(ConstructBinaryTree.Node root , List<String> ans, String path){
        if(root ==null)
            return;
        if(root.left ==null && root.right==null){
            path += root.data;
            ans.add(path);
            return;
        }
        rootToLeafPath(root.left, ans , path +root.data+"->");
        rootToLeafPath(root.right, ans , path +root.data+"->");

    }
}
