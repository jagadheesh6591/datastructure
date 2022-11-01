package com.jaga.solveproblem.dynamicprogramming;

public class MaxSubsetSumNoAdjacent {

    public static void main(String[] args) {

        int[] array = {75,105,120,75,90,135};
        maxSubsetSumNoAdjacent(array);


    }

    public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.

        if(array.length==0) {
            return 0;
        } else if (array.length==1) {
            return array[0];
        } else {
            int first = array[0];
            int second = Math.max(array[0],array[1]);
            int current = 0;
            for(int i=2;i<array.length;i++) {
                current = Math.max(second,first+array[i]);
                first = second;
                second = current;
            }
            return current;
        }
    }
}
