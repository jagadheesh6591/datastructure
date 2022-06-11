package com.jaga.solveproblem.tree.pojo;

import com.jaga.solveproblem.tree.TreeNode;

public class TreeUtil {

    public static TreeNode getBT() {
        TreeNode root = new TreeNode(3);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.right.right=new TreeNode(5);
        return root;

    }
}
