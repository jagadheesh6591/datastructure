package com.jaga.solveproblem.neetcode150.slidingwindow;

public class MinSizeSubArray {

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int result = minSubArrayLen(target,nums);
        System.out.println(result);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE, left=0;
        int sum =0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while(sum>=target) {
                minLength=Math.min(minLength,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE?-1:minLength;
    }
}
