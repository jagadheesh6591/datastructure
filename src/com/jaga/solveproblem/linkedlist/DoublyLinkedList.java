package com.jaga.solveproblem.linkedlist;

public class DoublyLinkedList {
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
        while(currNode.next!=null){
            currNode = currNode.next;
        }

        currNode.next = node;
        node.prev=currNode;
    }

    private void printList(DoublyLinkedList mylist) {
        System.out.println();
        DoublyLinkedList.Node currNode = mylist.head;
        while(currNode!=null) {
            System.out.print(currNode.data);
            System.out.print(currNode.next!=null?" -> ":"");
            currNode = currNode.next;
        }

    }

    private void printListFromLast(DoublyLinkedList myList) {
        System.out.println();
        DoublyLinkedList.Node currNode = myList.head;
        while(currNode.next!=null) {
            currNode = currNode.next;
        }

        while(currNode!=null){
            System.out.print(currNode.data);
            System.out.print(currNode.prev!=null?" -> ":"");
            currNode=currNode.prev;
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList mylist = new DoublyLinkedList();
        mylist.insert(1);
        mylist.insert(2);
        mylist.insert(3);
        mylist.insert(4);
        mylist.reverse();
        mylist.printList(mylist);
        mylist.printListFromLast(mylist);
        //mylist.remove(2);
        //mylist.printList(mylist);

    }

    private void reverse() {

        //Node currentNode = head;
        /* swap next and prev for all nodes of
         doubly linked list */
        while(head !=null){

            Node temp = head.prev;
            head.prev = head.next;
            head.next=temp;

            if(head.prev==null) {

            }

            head = head.prev;


        }

        /* Before changing head, check for the cases like empty
         list and list with only one node */


    }

}
