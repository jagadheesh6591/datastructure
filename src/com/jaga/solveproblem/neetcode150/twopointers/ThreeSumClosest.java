package com.jaga.solveproblem.neetcode150.twopointers;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Test 1: " + threeSumClosest(nums1, target1));

    }

    private static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        int minDistance = Math.abs(closestSum - target);
        for (int i = 0; i < nums.length; i++) {
            int fp=i+1,rP=nums.length-1;
            while(fp<rP) {

                int sum = nums[i] + nums[fp] + nums[rP];
                int distance = Math.abs(sum-target);
                if(distance < minDistance) {
                    minDistance = distance;
                    closestSum = sum;
                }

                if(sum<target) {
                    fp++;
                } else {
                    rP--;
                }


            }
        }

        return closestSum;
    }


}
