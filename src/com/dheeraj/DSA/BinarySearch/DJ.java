package com.dheeraj.DSA.BinarySearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class DJ {

    static TreeNode insert(TreeNode root, int val, boolean isLeft) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (isLeft) {
            root.left = new TreeNode(val);
            return root.left;
        } else {
            root.right = new TreeNode(val);
            return root.right;
        }
    }

    static TreeNode buildBinaryTree(String[] input) {
        TreeNode root = null;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isLeft = true;

        for (String str : input) {
            if (str.equals("true")) {
                TreeNode newNode = new TreeNode(Integer.parseInt(input[0]));
                if (root == null) {
                    root = newNode;
                    queue.add(root);
                } else {
                    TreeNode current = queue.peek();
                    TreeNode child = insert(current, Integer.parseInt(input[0]), isLeft);
                    queue.add(child);
                }
            } else if (str.equals("false")) {
                queue.poll();
            }
            isLeft = !isLeft;
        }

        return root;
    }

    static void printLevelOrder(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                System.out.print(current.val + " ");
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input = sc.next();
        String[] tokens = input.split(" ");
        TreeNode root = buildBinaryTree(tokens);
        printLevelOrder(root);
    }
}

