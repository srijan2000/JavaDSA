package com.srijan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data ){
            this.data = data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first;
        root.left = second;
        root.right = third;

        second.left = fourth;
    }
    //Pre Order BinaryTree Traversa;
    /*
    Vist the root node;
    Traverse the left subtree in preorder fashion
    Traverse the right subtree in preorder fashion
     */


    // Recursive PreOder Traversal
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Iterative PreOrder Traversal
    public void preOrderIterative(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
               stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }
    // InOrder Tree Traversal
    /*Traverse the left subTree in Inorder fashion
    * Visit the root node
    * Traverse the right subTree in Inorder fashion
    * */

    //recursive
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //Iterative
    public void inOrderIterative(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    /*
    * Post-Order traversal of a Binary Tree in Java
    * Traverse the left subtree in post order fashion
    * Traverse the right subtree in post order fashion
    * visit the node
    * */

   /* public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }*/
   public void postOrder(TreeNode root){
       TreeNode current = root;
       Stack<TreeNode> stack = new Stack<>();
       while(current != null || !stack.isEmpty()){
           if(current != null){
               stack.push(current);
               current = current.left;
           }
           else{
               TreeNode temp = stack.peek().right;
               if(temp == null){
                   temp = stack.pop();
                   System.out.print(temp.data + " ");
                   while(!stack.isEmpty() && temp == stack.peek().right){
                       temp = stack.pop();
                       System.out.print(temp.data + " ");
                   }
               }
               else{
                   current = temp;
               }
           }
       }
   }

   //LevelOrderTraversal

    public void levelOrderTraversal(TreeNode root){
       if(root == null){
           return;
       }
       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(root);
       while (! queue.isEmpty()){
           TreeNode temp = queue.poll();
           System.out.print(temp.data + " ");
           if(temp.left != null){
               queue.offer(temp.left);
           }
           if(temp.right != null){
               queue.offer(temp.right);
           }

       }
    }
    /*public int findMax(TreeNode root){
       if(root == null){
           return Integer.MIN_VALUE;
       }
       int result = root.data;
       int left = findMax(root.left);
       int right = findMax(root.right);
       if(left > result){
           result = left;
       }
       if(right > result){
           result = right;
       }
       return result;
    }*/

    public int findMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }
        return result;
    }


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrderIterative(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
        System.out.println();
        bt.levelOrderTraversal(bt.root);
        System.out.println();
        System.out.println(bt.findMax(bt.root));
    }

}
