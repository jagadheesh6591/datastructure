package com.jaga.solveproblem.neetcode150.twopointers;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        Integer[] height = {1,8,6,2,5,4,8,3,7};
        Integer result = containerWithMostWater(height);
        System.out.println(result);

        // Test case 2
        Integer[] heights2 = {1,1};
        System.out.println("Test 2: " + containerWithMostWater(heights2)); // Expected: 1

        // Test case 3
        Integer[] heights3 = {4,3,2,1,4};
        System.out.println("Test 3: " + containerWithMostWater(heights3)); // Expected: 16

        // Test case 4
        Integer[] heights4 = {1,2,1};
        System.out.println("Test 4: " + containerWithMostWater(heights4)); // Expected: 2


    }

    private static Integer containerWithMostWater(Integer[] heights) {
        int result = 0;
//        for(int h=0;h< heights.length;h++) {
//            int i=h,j=heights.length-1;
//
//
//            while(i<j) {
//                int temp = (j-i) * Math.min(heights[i],heights[j]);
//                result = Math.max(result, temp);
//                i++;
//                j--;
//            }
//
//        }

        int i=0,j=heights.length-1;

        while(i<j) {
            int temp = (j-i) * Math.min(heights[i],heights[j]);
            result = Math.max(result, temp);

            if(heights[i]<heights[j]) {
                i++;
            } else {
                j--;
            }

        }

        return result;
    }
}
