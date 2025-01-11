package com.jaga.solveproblem.neetcode150.twopointers;

import com.jaga.solveproblem.common.MyUtil;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        MyUtil.print(result);
        System.out.println();
        List<List<Integer>> result1 = threeSum(new int[]{-2,0,0,2,2});
        MyUtil.print(result1);

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {

            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }

            int fp=i+1, rp= nums.length-1;

            while(fp<rp) {
                int sum = nums[i] + nums[fp] + nums[rp];
                if(sum==0) {
                    result.add(Arrays.asList(nums[i],nums[fp],nums[rp]));

                    while(fp<rp && nums[fp] == nums[fp+1]) {
                        fp++;
                    }

                    while(fp<rp && nums[rp] == nums[rp-1]) {
                        rp--;
                    }

                    rp--;
                    fp++;

                } else if(sum>0) {
                    rp--;
                } else {
                    fp++;
                }
            }
        }

        return result;
    }
}
