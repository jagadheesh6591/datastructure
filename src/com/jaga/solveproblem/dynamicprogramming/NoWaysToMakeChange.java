package com.jaga.solveproblem.dynamicprogramming;

import com.jaga.solveproblem.common.MyUtil;

public class NoWaysToMakeChange {

    public static void main(String[] args) {
        int[] denomination = {1,5,10,25};
        int targetAmount = 10;
        numberOfWaysToMakeChange(targetAmount,denomination);
    }

    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        // Write your code here.
        int[] ways = new int[n+1];
        ways[0]=1;

        for (int i = 0; i < denoms.length; i++) {
            int denom = denoms[i];
            for (int amount = denom; amount < ways.length; amount++) {
                if(denom <= amount ) {
                    ways[amount] += ways[amount-denom];
                }
            }
        }

        MyUtil.print(ways);


        return ways[n];
    }
}
