package com.jaga.solveproblem.dynamicprogramming;

import com.jaga.solveproblem.common.MyUtil;

import java.util.Arrays;

public class NoOfWaysToTraverseGraph {

    public static void main(String[] args) {
        int result = numberOfWaysToTraverseGraph(4, 3);
        System.out.println(result);

    }

    public static int numberOfWaysToTraverseGraph(int width, int height) {
        // Write your code here.
        int[][] ways = new int[height][width];
//        for(int[] way : ways)
//            Arrays.fill(way,0);

        MyUtil.print2Array(ways);

        System.out.println();

        int i=0;
        for (; i < ways.length; i++) {
            for (int j=0; j < ways[0].length; j++) {

                if(i==0 || j==0) {
                    ways[i][j]=1;
                } else {
                    int up = ways[i][j-1];
                    int down = ways[i-1][j];
                    ways[i][j]=up+down;
                }
            }
        }

        MyUtil.print2Array(ways);

        return ways[height-1][width-1];
    }
}
