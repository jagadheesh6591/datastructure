package com.jaga.solveproblem.linkedlist;

import java.util.NoSuchElementException;

public class MyLinkedList {

    Node head = null;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        MyLinkedList mylist = new MyLinkedList();
        mylist.insert(1);
        mylist.insert(2);
        mylist.insert(3);
        mylist.insert(4);
        mylist.printList(mylist);
        mylist.remove(2);
        mylist.printList(mylist);
        mylist.append(5);
        mylist.printList(mylist);
        mylist.appendAfterPosition(2,1);
        mylist.printList(mylist);
    }

    private void remove(int data) {

        if(head==null)
            throw new RuntimeException("Cannot perform operation as list is empty");

        if(head.data == data){
            head = head.next;
            return;
        }

        Node currNode = head.next;
        Node prevNode = head;

        while(currNode!=null && currNode.data != data) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        if(currNode==null)
            throw new NoSuchElementException();

        prevNode.next = currNode.next;

    }

    private void printList(MyLinkedList mylist) {
        System.out.println();
        Node currNode = mylist.head;
        while(currNode!=null) {
            System.out.print(currNode.data);
            System.out.print(currNode.next!=null?" -> ":"");
            currNode = currNode.next;
        }
    }

    private void insert(int data) {
        Node node = new Node(data);
        if(head==null) {
            head = node;
        } else {
            Node last = this.head;
            while(last.next!=null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    private void append(int data) {

        Node node = this.getNode(data);
        if(this.head==null) {
            this.head=node;
            return;
        }

        Node last = this.head;
        while(last.next!=null){
            last=last.next;
        }
        last.next = node;
    }

    private void appendAfterPosition(int data, int position){

        Node newNode = this.getNode(data);
        Node currNode = this.head;
        Node prevNode = this.head;
        while(position>0) {
            if(currNode.next==null){
                throw new RuntimeException("List overflow");
            }
            prevNode=currNode;
            currNode=currNode.next;
            position--;
        }
        newNode.next=currNode;
        prevNode.next=newNode;
    }

    private Node getNode(int data) {
        return new Node(data);
    }







}
