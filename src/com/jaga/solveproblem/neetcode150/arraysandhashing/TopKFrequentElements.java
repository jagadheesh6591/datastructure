package com.jaga.solveproblem.neetcode150.arraysandhashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static void main(String[] args) {


    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> store = new HashMap<>();
        for(int num : nums) {
            store.put(num, store.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> entry : store.entrySet()) {
            minHeap.offer(entry);
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = k-1; i >=0 ; i--) {
            result[i] = minHeap.poll().getKey();
        }

        return result;

    }
}
