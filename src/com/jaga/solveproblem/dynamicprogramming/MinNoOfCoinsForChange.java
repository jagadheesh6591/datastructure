package com.jaga.solveproblem.dynamicprogramming;

import com.jaga.solveproblem.common.MyUtil;

import java.util.Arrays;

public class MinNoOfCoinsForChange {

    public static void main(String[] args) {

        int[] denoms = {2,1};
        int target = 3;
        int i = minNumberOfCoinsForChange(target, denoms);
        System.out.println(i);

    }

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        // Write your code here.
        int[] ways = new int[n+1];
        Arrays.fill(ways,Integer.MAX_VALUE);
        ways[0]=0;

        for (int denomIdx = 0; denomIdx < denoms.length; denomIdx++) {
            int denom = denoms[denomIdx];

            for (int amount = 0; amount <= n; amount++) {

                if(amount>=denom) {
                    if(ways[amount-denom] < Integer.MAX_VALUE)
                        ways[amount] = Math.min(ways[amount],1+ways[amount-denom]);
                }
            }

        }

        //MyUtil.print(ways);

        return ways[n]== Integer.MAX_VALUE? -1: ways[n];
    }
}
