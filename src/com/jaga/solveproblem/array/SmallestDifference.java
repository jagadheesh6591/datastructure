package com.jaga.solveproblem.array;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String[] args) {
        int[] arrayOne = {-1,5,10,20,28,3};
        int[] arrayTwo = {26,134,135,15,7};


    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int distance = Integer.MAX_VALUE;
        int[] result = new int[2];
        int p1 = 0, p2=0;
        while(p1<arrayOne.length && p2<arrayTwo.length) {
            int a = Math.abs(arrayOne[p1]);
            int b = Math.abs(arrayTwo[p2]);
            if(a-b==0) {
                return new int[] {arrayOne[p1],arrayTwo[p2]};
            }

            if(Integer.signum(arrayOne[p1])==Integer.signum(arrayTwo[p2])) {



            } else {

            }
        }



        return new int[] {};
    }
}
