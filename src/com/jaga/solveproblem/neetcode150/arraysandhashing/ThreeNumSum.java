package com.jaga.solveproblem.neetcode150.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class ThreeNumSum {

    public static void main(String[] args) {
        List<List<Integer>> results = threeNumberSum(new int[]{-1, -1, 0, 1, 1, 2}, 0);

        results.forEach(val -> {
            System.out.println("["+val.get(0)+","+val.get(1)+","+val.get(2)+"]");
        });

    }

    public static List<List<Integer>> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < array.length - 2; i++) {
            // Skip duplicate values for i
            if (i > 0 && array[i] == array[i-1]) continue;

            int fP = i + 1;
            int rP = array.length - 1;

            while (fP < rP) {
                int sumTemp = array[i] + array[fP] + array[rP];

                if (sumTemp == targetSum) {
                    result.add(Arrays.asList(array[i], array[fP], array[rP]));

                    // Skip duplicates for fP
                    while (fP < rP && array[fP] == array[fP+1]) fP++;
                    // Skip duplicates for rP
                    while (fP < rP && array[rP] == array[rP-1]) rP--;

                    fP++;
                    rP--;
                } else if (sumTemp < targetSum) {
                    fP++;
                } else {
                    rP--;
                }
            }
        }
        return result;
    }
}
