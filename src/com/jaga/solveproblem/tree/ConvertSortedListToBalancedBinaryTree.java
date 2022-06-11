package com.jaga.solveproblem.tree;

import com.jaga.solveproblem.linkedlist.ListNode;

public class ConvertSortedListToBalancedBinaryTree {

    public static void main(String[] args) {

        ListNode head = new ListNode(-10,new ListNode(-3,new ListNode(0, new ListNode(5,new ListNode(9)))));
        ConvertSortedListToBalancedBinaryTree balancedBinaryTree = new ConvertSortedListToBalancedBinaryTree();
        TreeNode treeNode = balancedBinaryTree.sortedListToBST(head);

    }

    public TreeNode sortedListToBST(ListNode head) {

        if(head == null) {
            return null;
        }

        ListNode midNode = findMiddleNode(head);
        TreeNode root = new TreeNode(midNode.val);

        if(head == midNode) {
            return root;
        }

        root.left= sortedListToBST(head);
        root.right = sortedListToBST(midNode.next);
        return root;


    }

    private static ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev=head;

        while(fast!=null && fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prev!=null)
            prev.next=null;

        return slow;

    }
}
