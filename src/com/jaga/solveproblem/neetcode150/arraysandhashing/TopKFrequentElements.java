package com.jaga.solveproblem.neetcode150.arraysandhashing;

import com.jaga.solveproblem.common.MyUtil;

import java.awt.event.WindowStateListener;
import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int[] result = topKFrequentTest(new int[]{1, 1, 1, 2, 2, 3, 4, 4, 4, 4}, 2);
        MyUtil.print(result);

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

    public static int[] topKFrequentTest(int[] nums, int k) {

        Map<Integer, Integer> store =  new HashMap<>();
        for (int num : nums) {
            store.put(num, store.getOrDefault(num, 0) + 1);
        }

       PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
       store.entrySet().forEach(entrySet -> {
           minHeap.offer(entrySet);
           if(minHeap.size()>k) {
               minHeap.poll();
           }
       });


        int[] result = new int[k];
        // to be added

        for(int i=0;i<k;i++) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }
}
