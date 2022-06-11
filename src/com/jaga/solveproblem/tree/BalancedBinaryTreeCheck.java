package com.jaga.solveproblem.tree;

public class BalancedBinaryTreeCheck {

    private Node root;

    public boolean isBalancedBT(Node root) {

        return bottomTop(root) != -1;
    }

    public int bottomTop(Node node) {

        if(node ==null ) return 0;

        int leftSubTreeDepth = bottomTop(node.left);

        if(leftSubTreeDepth==-1) {
            return -1;
        }

        int rightSubTreeDepth = bottomTop(node.right);

        if(rightSubTreeDepth ==-1) {
            return -1;
        }

        return Math.abs(leftSubTreeDepth-rightSubTreeDepth)<=1 ? Math.max(leftSubTreeDepth,rightSubTreeDepth)+1:-1;
    }


    public static void main(String[] args) {
        BalancedBinaryTreeCheck tree =  new BalancedBinaryTreeCheck();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    }
}
