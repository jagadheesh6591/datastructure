package com.jaga.solveproblem.ds.linear_data_structure;

public class SortedDoublyLinkedList {
    Node head = null;

    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insert(int data) {

        Node node = new Node(data);
        if(this.head==null) {
            this.head=node;
            return;
        }

        Node currNode = this.head;
        while(currNode.next!=null && currNode.next.data<data){
            currNode = currNode.next;
        }

        /*make appropriate link*/
        node.next=currNode.next;

        /*if the new node is not inserted  at the end of the list*/
        if(currNode.next!=null) {
            currNode.next.prev=node;
        }

        currNode.next=node;
        node.prev=currNode;
    }

    private void printList(SortedDoublyLinkedList mylist) {
        System.out.println();
        SortedDoublyLinkedList.Node currNode = mylist.head;
        while(currNode!=null) {
            System.out.print(currNode.data);
            System.out.print(currNode.next!=null?" -> ":"");
            currNode = currNode.next;
        }

    }

    public static void main(String[] args) {
        SortedDoublyLinkedList mylist = new SortedDoublyLinkedList();
        mylist.insert(1);
        mylist.insert(4);
        mylist.insert(3);
        mylist.insert(2);
        mylist.printList(mylist);

        //mylist.remove(2);
        //mylist.printList(mylist);

    }

}
