package com.jaga.solveproblem.ds.queue;

public class IntQueue {

/* TODO Implement Queue */

    private int[] q;
    private int front,rear,size;
    private int capacity;

    public IntQueue(int capacity) {
        this.capacity =capacity;
        q = new int[capacity];
        this.front=this.rear=size=0;
    }

    public boolean isEmpty() {
        return this.size==0;
    }

    public int peek() {
        return this.q[0];
    }

    public void enqueue(int value) {
        if(this.rear<capacity) {
            q[rear]=value;
            rear++;
            size++;
        } else {
            throw new RuntimeException("Queue is overflowing...");
        }
    }

    public int dequeue() {

        if(this.size>0) {
            int returnValue = q[front];
            this.front = (this.front + 1)
                    % this.capacity;
            size--;
            return returnValue;
        } else {
            throw new RuntimeException("Queue is underflowing...");
        }
    }



    public static void main(String[] args) {
        IntQueue intQueue = new IntQueue(5);
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(5);

        intQueue.printQueue();

        intQueue.dequeue();
        intQueue.printQueue();

        intQueue.dequeue();
        intQueue.printQueue();

        intQueue.dequeue();
        intQueue.printQueue();

        intQueue.dequeue();
        intQueue.printQueue();

        intQueue.dequeue();
        intQueue.printQueue();
    }

    private void printQueue() {

        System.out.println("\n Queue elements are - ");
        for (int i = front; i < this.q.length; i++) {
            System.out.print(" "+q[i]);

        }

    }
}
