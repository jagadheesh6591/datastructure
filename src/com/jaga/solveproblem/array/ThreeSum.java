package com.jaga.solveproblem.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] inputs = {12,3,1,2,-6,5,-8,6};
        int targetSum=0;
        Arrays.sort(inputs);
        threeNumberSum( inputs,targetSum);
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int fP = i+1;
            int rP = array.length-1;

            while(fP<rP) {
                int sumTemp = array[i]+array[fP]+array[rP];
                if(sumTemp==targetSum) {
                    result.add(new Integer[] {array[i],array[fP],array[rP]});
                    fP++;
                    rP--;
                } else if(sumTemp<targetSum) {
                    fP++;
                } else {
                    rP--;
                }
            }
        }

        return result;
    }
}
