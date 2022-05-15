package com.jaga.solveproblem.ds.tree;

public class Node {

    int key;
    Node left,right;

    public Node(int key) {
        this.key = key;
        this.left=this.right=null;
    }
}
