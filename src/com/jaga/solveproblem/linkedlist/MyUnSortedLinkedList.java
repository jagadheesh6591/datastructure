package com.jaga.solveproblem.linkedlist;

import java.util.NoSuchElementException;

public class MyUnSortedLinkedList {

    private Node head = null;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {

        Node node = new Node(data);
        if(this.head==null) {// List is empty
            this.head = node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }


    public void remove(int data) {

        if(this.head==null)
            throw new RuntimeException("List is empty");

        if(this.head.data==data) {
            this.head=this.head.next;
            return;
        }

        Node currentData = this.head.next;
        Node previousData = this.head;
        while(currentData!=null && currentData.data!=data) {
            previousData=currentData;
            currentData=currentData.next;
        }

        if(currentData==null)
            throw new NoSuchElementException(String.valueOf(data));

        previousData.next=currentData.next;
    }

    private void insertByPosition(int position, int data) {

        Node node = new Node(data);



    }

    private void printList(MyUnSortedLinkedList mylist) {
        System.out.println();
        MyUnSortedLinkedList.Node currNode = mylist.head;
        while(currNode!=null) {
            System.out.print(currNode.data);
            System.out.print(currNode.next!=null?" -> ":"");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        MyUnSortedLinkedList mylist = new MyUnSortedLinkedList();
        mylist.insert(1);
        mylist.insert(2);
        mylist.insert(3);
        mylist.insert(4);
        mylist.printList(mylist);
        mylist.remove(2);
        mylist.printList(mylist);

    }






}
