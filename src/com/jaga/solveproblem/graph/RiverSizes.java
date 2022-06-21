package com.jaga.solveproblem.graph;

import com.jaga.solveproblem.common.MyUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RiverSizes {

    public static void main(String[] args) {

        int[][] array = getMaxtrix();
        boolean[][] visitedMatrix = getVisitedMatrix(array);
        List<Integer> integers = riverSizes(array,visitedMatrix);
        MyUtil.print(integers);

    }

    private static boolean[][] getVisitedMatrix(int[][] matrix) {
        boolean[][] array = new boolean[matrix.length][matrix.length];
        return array;
    }

    public static List<Integer> riverSizes(int[][] matrix, boolean[][] visitedMatrix) {

        ArrayList<Integer> riverSizes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(visitedMatrix[i][j])
                    continue;
                int riverSize = doTraversal(matrix, i, j, visitedMatrix);
                if(riverSize>0) {
                    riverSizes.add(riverSize);
                }
            }
        }

        return riverSizes;
    }

    private static int doTraversal(int[][] matrix, int i, int j, boolean[][] visitedMatrix) {

        Queue<int[]> queue = new LinkedList();
        queue.add(new int[] {i,j});
        int riverSize=0;

        while (!queue.isEmpty()) {

            int[] head = queue.poll();
            i=head[0];
            j=head[1];
            if(visitedMatrix[i][j]) {
              continue;
            }
            visitedMatrix[i][j]=true;
            if(matrix[i][j]==0) {
                continue;
            }

            riverSize++;

            List<int[]> unVisitedNeighbour = getUnVisitedNeighbour(i,j,matrix,visitedMatrix);
            queue.addAll(unVisitedNeighbour);

        }

        return riverSize;

    }

    private static List<int[]> getUnVisitedNeighbour(int i, int j, int[][] matrix, boolean[][] visitedMatrix) {

        List<int[]> unVisitedNeighbour = new ArrayList<>();
        if(i>0&&!visitedMatrix[i-1][j]) {
            unVisitedNeighbour.add(new int[] {i-1,j});
        }
        if(i<matrix.length-1&&!visitedMatrix[i+1][j]) {
            unVisitedNeighbour.add(new int[] {i+1,j});
        }
        if(j>0&&!visitedMatrix[i][j-1]) {
            unVisitedNeighbour.add(new int[] {i,j-1});
        }
        if(j<matrix[0].length-1&&!visitedMatrix[i][j+1]) {
            unVisitedNeighbour.add(new int[] {i,j+1});
        }

        return unVisitedNeighbour;
    }

    private static int[][] getMaxtrix() {
        int[][] array = new int[5][5];
        array[0][0] = 1;
        array[0][1] = 0;
        array[0][2] = 0;
        array[0][3] = 1;
        array[0][4] = 0;

        array[1][0] = 1;
        array[1][1] = 0;
        array[1][2] = 1;
        array[1][3] = 0;
        array[1][4] = 0;

        array[2][0] = 0;
        array[2][1] = 0;
        array[2][2] = 1;
        array[2][3] = 0;
        array[2][4] = 1;

        array[3][0] = 1;
        array[3][1] = 0;
        array[3][2] = 1;
        array[3][3] = 0;
        array[3][4] = 1;

        array[4][0] = 1;
        array[4][1] = 0;
        array[4][2] = 1;
        array[4][3] = 1;
        array[4][4] = 0;

        for (int i = 0; i < array[0].length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+", ");

            }
            System.out.print("]");
            System.out.println();
        }
        
        return array;
    }

    private static int[][] getMaxtrix1() {
        int[][] array = new int[1][11];
        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;
        array[0][3] = 0;
        array[0][4] = 1;
        array[0][1] = 1;
        array[0][6] = 0;
        array[0][7] = 0;
        array[0][8] = 0;
        array[0][9] = 1;
        array[0][10] = 0;

        for (int i = 0; i < array[0].length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+", ");

            }
            System.out.print("]");
            System.out.println();
        }

        return array;
    }



}
