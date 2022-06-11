package com.jaga.solveproblem.tree;

public class MaxSumPath {

    /* https://leetcode.com/problems/binary-tree-maximum-path-sum/ */
    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode root) {

        if(root==null) {
            return 0;
        }

        int leftSubSum = dfs(root.left);
        int rightSubSum = dfs(root.right);

        int maxLeftSubSum = Math.max(0,leftSubSum);
        int maxRightSubSum = Math.max(0,rightSubSum);

        maxSum =  Math.max(maxSum,maxLeftSubSum+maxRightSubSum+root.val);

        return Math.max(maxLeftSubSum,maxRightSubSum)+root.val;

    }
}
