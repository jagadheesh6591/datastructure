package com.jaga.solveproblem.neetcode150.slidingwindow;

public class BestTimeToBuySellStocks {

    public static void main(String[] args) {
        int[] input ={7,1,5,3,6,4};
        int maxProfit = maxProfit(input);
        System.out.println(maxProfit);
    }

    private static int maxProfit(int[] input) {
        int maxProfit=0;
        int minBuyValue = input[0];

        for (int i = 1; i < input.length; i++) {
           maxProfit= Math.max(maxProfit, input[i]-minBuyValue);
           minBuyValue= Math.min(minBuyValue,input[i]);
        }

        return maxProfit;
    }
}
