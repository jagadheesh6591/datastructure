package com.jaga.solveproblem.java;

import java.util.PriorityQueue;

public class PriorityQueueSample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(1);

        // Add elements to the queue
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(9);
        pq.add(11);

        System.out.println(pq.offer(10));


        // Display elements (priority order)
        System.out.println("Priority Queue: " + pq);

        // Peek (get the smallest element)
        System.out.println("Head of the queue (min): " + pq.peek());

        // Poll (remove the smallest element)
        System.out.println("Removed: " + pq.poll());

        // Display remaining elements
        System.out.println("Priority Queue after poll: " + pq);

    }
}
