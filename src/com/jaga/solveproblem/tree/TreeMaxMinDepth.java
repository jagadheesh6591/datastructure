package com.jaga.solveproblem.tree;


public class TreeMaxMinDepth {

    public Node root;

    public int maxDepth(Node root) {

        if(root==null)
            return 0;

        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }

    public int minDepth(Node root) {

        if(root==null) {return 0;}

        if(root.left==null) return minDepth(root.right)+1;

        if(root.right ==null) return minDepth(root.left)+1;

        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

    public static void main(String[] args) {

        TreeMaxMinDepth tree = new TreeMaxMinDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Maximum depth of tree is "+ tree.maxDepth(tree.root));
        System.out.println("Minimum depth of tree is "+ tree.minDepth(tree.root));


    }
}
