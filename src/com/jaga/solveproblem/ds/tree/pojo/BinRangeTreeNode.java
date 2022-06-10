package com.jaga.solveproblem.ds.tree.pojo;

public class BinRangeTreeNode {

    public long val;
    public BinRangeTreeNode left;
    public BinRangeTreeNode right;

    BinRangeTreeNode() {
    }

    public BinRangeTreeNode(long val) {
        this.val = val;
    }

    public BinRangeTreeNode(long val, BinRangeTreeNode left, BinRangeTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
