package com.jaga.solveproblem.ds.linear_data_structure;

public class CircularDoublyLinkedList {
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
        Node prevNode = this.head;
        while(currNode.next!=null && currNode.data<data){
            prevNode=currNode;
            currNode = currNode.next;
        }

        node.next=currNode;
        prevNode.next=node;

    }

    private void printList(CircularDoublyLinkedList mylist) {
        System.out.println();
        CircularDoublyLinkedList.Node currNode = mylist.head;
        while(currNode!=null) {
            System.out.print(currNode.data);
            System.out.print(currNode.next!=null?" -> ":"");
            currNode = currNode.next;
        }

    }

    public static void main(String[] args) {
        CircularDoublyLinkedList mylist = new CircularDoublyLinkedList();
        mylist.insert(1);
        mylist.insert(4);
        mylist.insert(3);
        mylist.insert(2);
        mylist.printList(mylist);

        //mylist.remove(2);
        //mylist.printList(mylist);

    }

}
