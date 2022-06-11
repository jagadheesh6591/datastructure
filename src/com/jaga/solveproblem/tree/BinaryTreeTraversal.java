package com.jaga.solveproblem.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {

    Node root;

    public BinaryTreeTraversal() {
        this.root = null;
    }

    public static void main(String[] args) {

        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order Traversal : ");
        List<Integer> inOrderList = new ArrayList<>();
        tree.inorder(tree.root,inOrderList);
        tree.print(inOrderList);

        System.out.println("\n Pre-order Traversal : ");
        List<Integer> preOrderList = new ArrayList<>();
        tree.preOrder(tree.root,preOrderList);
        tree.print(preOrderList);

        System.out.println("\n Post-order Traversal : ");
        List<Integer> postOrderList = new ArrayList<>();
        tree.postOrder(tree.root,postOrderList);
        tree.print(postOrderList);

    }

    public void print(List<Integer> inOrderList) {

        for (Integer integer : inOrderList) {
            System.out.print(" "+integer);
        }
    }

    public void postOrder(Node node, List<Integer> postOrderList) {
        if(node==null)
            return;

        postOrder(node.left, postOrderList);
        postOrder(node.right, postOrderList);
        //System.out.print(" "+node.key);
        postOrderList.add(node.key);
    }

    public void preOrder(Node node, List<Integer> preOrderList) {
        if(node==null)
            return;

        //System.out.print(" "+node.key);
        preOrderList.add(node.key);
        preOrder(node.left, preOrderList);
        preOrder(node.right, preOrderList);

    }

    public void inorder(Node node, List<Integer> inOrderList) {

        if(node==null)
            return;

        inorder(node.left, inOrderList);
        //System.out.print(" "+node.key);
        inOrderList.add(node.key);
        inorder(node.right, inOrderList);

    }
}
