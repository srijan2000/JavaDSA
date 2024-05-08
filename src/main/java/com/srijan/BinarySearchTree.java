package com.srijan;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        private TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }

 /*   public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        }else {
            root.right = insert(root.right, value);
        }
        return root;
    }*/
    public void insert(int value){
        root = insert(root, value);
    }
    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        }else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode search(int key){
        return search(root, key);
    }
    public TreeNode search(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key < root.data){
            return search(root.left, key);
        }else {
            return search(root.right, key);
        }
    }
    long min = Integer.MIN_VALUE;
    long max = Integer.MAX_VALUE;
    public boolean isValid(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        boolean left = isValid(root.left, min, root.data);
        if(left){
            boolean right = isValid(root.right, root.data, min );
            return right;
        }
        return false;
    }
    public boolean isValid(){
       return isValid(root, min, max);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(11);
        bst.insert(5);
        bst.insert(16);
        bst.insert(1);
        //To get the sorted order of bst use inorder Traversal
        bst.inOrder();
        System.out.println();

        if(null != bst.search(3)){
            System.out.println("Key Found !!");
        }else {
            System.out.println("Key Not Found !!");
        }

        System.out.println("Is Valid : " + bst.isValid());

    }

}
