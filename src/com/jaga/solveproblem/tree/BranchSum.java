package com.jaga.solveproblem.tree;

import com.jaga.solveproblem.common.MyUtil;
import com.jaga.solveproblem.tree.pojo.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

    public static void main(String[] args) {

        TreeNode rootNode = getBT();
        ArrayList<Integer> inorderResult = new ArrayList<>();
        inorder(rootNode, inorderResult);
        MyUtil.print(inorderResult);
        System.out.println();
        branchSums(rootNode);

    }

    public static List<Integer> branchSums(TreeNode root) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        bfs(root,0,result);
        MyUtil.print(result);
        return result;
    }

    private static void bfs(TreeNode root,int runningSum, ArrayList<Integer> result) {

        if(root==null) {
            return;
        }

        int newRunningSum = runningSum+root.val;

        if(root.right==null && root.left==null) {
            result.add(newRunningSum);
        }

        bfs(root.left,newRunningSum,result);
        bfs(root.right,newRunningSum,result);
    }


    public static TreeNode getBT() {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.left.left=new TreeNode(8);
        root.left.left.right=new TreeNode(9);

        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(10);


        root.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;

    }

    public static void inorder(TreeNode node, List<Integer> inOrderList) {

        if(node==null)
            return;

        inorder(node.left, inOrderList);
        //System.out.print(" "+node.key);
        inOrderList.add(node.val);
        inorder(node.right, inOrderList);

    }

}
