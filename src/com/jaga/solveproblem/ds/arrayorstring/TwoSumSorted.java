package com.jaga.solveproblem.ds.arrayorstring;

public class TwoSumSorted {

    public static void main(String[] args) {
        int num[] = {2,7,11,15};
        int target=9;

        int result[]=getTwoSumResult(num,target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    private static int[] getTwoSumResult(int[] num, int target) {

        int i=0,j=num.length-1;

        while(i<j) {
            int temp = num[i]+num[j];

            if(temp < target) {
                i++;
            } else if(temp > target) {
                j--;
            } else {
                return new int[] {i,j};
            }

        }

        throw new RuntimeException("No Such a Pair");

    }
}
