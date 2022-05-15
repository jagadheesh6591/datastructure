package com.jaga.solveproblem.ds.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertSortedArrayToBalancedBinaryTree {

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        int start =0;
        int end = nums.length-1;
        Node node = constructBBT(nums,start,end);
        BinaryTreeTraversal treeTraversal = new BinaryTreeTraversal();
        List<Integer> order = new ArrayList<>();
        treeTraversal.inorder(node, order);
        treeTraversal.print(order);

        CheckBinaryTree checkBinaryTree = new CheckBinaryTree();
        boolean validBST = checkBinaryTree.isValidBST(node, null, null);
        System.out.println(String.format("\n is Valid Binary Tree : %s",validBST));

        BalancedBinaryTreeCheck balancedBinaryTreeCheck = new BalancedBinaryTreeCheck();
        boolean balancedBT = balancedBinaryTreeCheck.isBalancedBT(node);
        System.out.println(String.format("\n is Valid Balanced Binary Tree : %s",validBST));

    }

    private static Node constructBBT(int[] nums, int start, int end) {

        if(start > end ) {
            return null;
        }

        int mid = (start + end) /2;
        Node node = new Node(nums[mid]);
        node.left = constructBBT(nums,start,mid-1);
        node.right = constructBBT(nums,mid+1, end);
        return node;

    }

}
