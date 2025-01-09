package com.jaga.solveproblem.array.neetcode150;

import com.jaga.solveproblem.common.MyUtil;

public class ProductOfExceptSelf {
    public static void main(String[] args) {

        int[] results = productExceptSelf(new int[]{1,2,3,4});
        //Output: [24,12,8,6]
        MyUtil.print(results);

        int[] results1 = productExceptSelf(new int[]{-1,1,0,-3,3});
        //Output: [0,0,9,0,0]
        MyUtil.print(results1);


    }

    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        int rightProduct = 1;
        for (int i = nums.length-1; i >=0; i--) {
            result[i] = result[i]*rightProduct;
            rightProduct = nums[i]*rightProduct;
        }
        return result;
    }
}
