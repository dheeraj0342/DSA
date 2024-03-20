package GLA.Tree;

public class BinaryTree {

    // implement binary tree make node class
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

  public static int height(Node root){
        if(root == null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
  }

  public static int countNode(Node root){
        if(root==null)
            return 0;
        return countNode(root.left)+countNode(root.right)+1;
  }

    public static int countLeaf(Node root){
            if(root==null)
                return 0;
            if(root.left==null && root.right==null)
                return 1;
            return countLeaf(root.left)+countLeaf(root.right);
    }

    public static boolean isBalance(Node root){
        if(root==null)
            return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.abs(lh-rh)<=1 && isBalance(root.left) && isBalance(root.right);
    }

    public static boolean search(Node root , int data){
        if(root==null)
            return false;
        if(root.data == data)
            return true;
        return search(root.left,data) || search(root.right,data);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println(height(root));
        System.out.println(countNode(root));
        System.out.println(countLeaf(root));
        System.out.println(isBalance(root));
        System.out.println(search(root,50));
    }

}
