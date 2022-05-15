package com.jaga.solveproblem.ds.tree;

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
        inorder(tree.root,inOrderList);
        print(inOrderList);

        System.out.println("\n Pre-order Traversal : ");
        List<Integer> preOrderList = new ArrayList<>();
        preOrder(tree.root,preOrderList);
        print(preOrderList);

        System.out.println("\n Post-order Traversal : ");
        List<Integer> postOrderList = new ArrayList<>();
        postOrder(tree.root,postOrderList);
        print(postOrderList);

    }

    private static void print(List<Integer> inOrderList) {

        for (Integer integer : inOrderList) {
            System.out.print(" "+integer);
        }
    }

    private static void postOrder(Node node, List<Integer> postOrderList) {
        if(node==null)
            return;

        postOrder(node.left, postOrderList);
        postOrder(node.right, postOrderList);
        //System.out.print(" "+node.key);
        postOrderList.add(node.key);
    }

    private static void preOrder(Node node, List<Integer> preOrderList) {
        if(node==null)
            return;

        //System.out.print(" "+node.key);
        preOrderList.add(node.key);
        preOrder(node.left, preOrderList);
        preOrder(node.right, preOrderList);

    }

    private static void inorder(Node node, List<Integer> inOrderList) {

        if(node==null)
            return;

        inorder(node.left, inOrderList);
        //System.out.print(" "+node.key);
        inOrderList.add(node.key);
        inorder(node.right, inOrderList);

    }
}
