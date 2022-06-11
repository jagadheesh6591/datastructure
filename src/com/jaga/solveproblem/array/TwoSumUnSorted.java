package com.jaga.solveproblem.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUnSorted {

    /* https://leetcode.com/problems/two-sum/
    * Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    *  */
    public static void main(String[] args) {

        int num[] = {2,7,11,15};
        int target=9;

        Integer result[]=getTwoSumResult(num,target);
        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i]+" ");
        }

    }

    private static Integer[] getTwoSumResult(int[] num, int target) {
        Map<Integer, Integer> store = new HashMap<>(num.length);

        for (int i = 0; i < num.length; i++) {

            if(store.get(target-num[i])!=null) {
                return new Integer[] { store.get(target-num[i])+1, i+1 };

            }
            store.put(num[i],i);

        }

        throw new RuntimeException("No such a pair");

    }
}
