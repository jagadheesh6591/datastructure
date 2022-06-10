package com.jaga.solveproblem.ds.tree;

import com.jaga.solveproblem.ds.tree.pojo.TreeUtil;

import java.util.List;

public class PathSum {

    /*https://leetcode.com/problems/path-sum/*/
    public static void main(String[] args) {
        System.out.println(hasPathSum(getBT(),13));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        return bfSum(root,0,targetSum);
    }

    public static boolean bfSum(TreeNode root,int currentSum, int targetSum) {

        if(root==null) {
            return false;
        }

        currentSum = currentSum + root.val;
        if(root.left==null && root.right==null && currentSum==targetSum) {
            return true;
        }

        return bfSum(root.left, currentSum,targetSum) || bfSum(root.right,currentSum,targetSum);

    }

    public static TreeNode getBT() {
        TreeNode root = new TreeNode(3);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.right.right=new TreeNode(6);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(7);
        return root;

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
