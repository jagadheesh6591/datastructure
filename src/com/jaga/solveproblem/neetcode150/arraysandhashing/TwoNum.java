package com.jaga.solveproblem.neetcode150.arraysandhashing;

import com.jaga.solveproblem.common.MyUtil;

import java.util.HashMap;
import java.util.Map;

public class TwoNum {

    public static void main(String[] args) {

        int[] results = twoSum(new int[]{2, 7, 11, 15}, 9);
        MyUtil.print(results);
        int[] results1 = twoSum(new int[]{3,2,4}, 9);
        MyUtil.print(results1);

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> store = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(store.containsKey(target - nums[i])) {
                return new int[] {i,store.get(target-nums[i])};
            } else {
                store.put(nums[i],i);
            }
        }

            return new int[]{};
        }


}
