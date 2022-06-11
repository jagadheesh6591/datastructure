package com.jaga.solveproblem.tree;

public class CheckBinaryTree {

    Node root;

    public static void main(String[] args) {

        CheckBinaryTree checkBinaryTree = new CheckBinaryTree();
        checkBinaryTree.root = new Node(1);
        checkBinaryTree.root.left = new Node(2);
        checkBinaryTree.root.right = new Node(3);
        checkBinaryTree.root.left.left = new Node(4);
        checkBinaryTree.root.left.right = new Node(5);

       // boolean validBT = checkBinaryTree.isValidBT(checkBinaryTree.root);
      //  System.out.println(String.format("is Valid Tree : %s",validBT));

        CheckBinaryTree checkBinaryTree1 = new CheckBinaryTree();
        checkBinaryTree.root = new Node(5);
        checkBinaryTree.root.left = new Node(3);
        checkBinaryTree.root.right = new Node(6);
        checkBinaryTree.root.left.left = new Node(2);
        checkBinaryTree.root.left.right = new Node(4);

    //    boolean validBT1 = checkBinaryTree1.isValidBT(checkBinaryTree.root);
      //  System.out.println(String.format("is Valid Tree : %s",validBT1));

        // Above solution O(n)Square , costly

        // We can optimize better to O(n)

        boolean validBST = checkBinaryTree1.isValidBST(checkBinaryTree.root, null, null);
        System.out.println(String.format("is Valid Tree - Optimized solution : %s",validBST));

    }

    public boolean isValidBST(Node root, Integer low, Integer high) {

        if(root==null) {
            return true;
        }

        return (low ==null || root.key > low) && (high==null || root.key < high) &&
                isValidBST(root.left,low,root.key) && isValidBST(root.right,root.key,high);

    }

    private boolean isValidBT(Node node) {

        if(node==null) {
            return true;
        }

        return isSubTreeLessThan(node.left,node.key) && isSubTreeGreaterThan(node.right,node.key) && isValidBT(node.left) && isValidBT(node.right);


    }

    private boolean isSubTreeLessThan(Node left, int key) {

        if(left ==null) {
            return true;
        }

        return left.key<key && isSubTreeLessThan(left.left,key) && isSubTreeLessThan(left.right,key);
    }

    private boolean isSubTreeGreaterThan(Node right, int key) {

        if(right==null) {
            return true;
        }

        return right.key> key && isSubTreeGreaterThan(right.left,key) && isSubTreeGreaterThan(right.right,key);
    }


}
