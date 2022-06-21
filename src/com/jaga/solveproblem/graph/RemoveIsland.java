package com.jaga.solveproblem.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RemoveIsland {

    public static void main(String[] args) {

        int[][] matrix = getMaxtrix();
        boolean[][] visitedMatrix = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                boolean isRowBorder = i==0||i==matrix.length-1;
                boolean isColBorder = j==0||j==matrix[i].length-1;
                boolean isBorder = isColBorder||isRowBorder;
                
                if(matrix[i][j]==0 || !isBorder)
                    continue;
                
                bfs(matrix,i,j,visitedMatrix);
                
            }
            
        }

        System.out.println("Result => ");

        for (int i = 0; i < matrix[0].length; i++) {
//            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
               // System.out.print(matrix[i][j]+", ");

                if(matrix[i][j]==2)
                    matrix[i][j]=1;
                else if(matrix[i][j]==1)
                    matrix[i][j]=0;

//                System.out.print(matrix[i][j]+", ");

            }
//            System.out.print("]");
//            System.out.println();
        }


    }

    private static void bfs(int[][] matrix, int i, int j, boolean[][] visitedMatrix) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});

        while(!queue.isEmpty()) {

            int[] head = queue.poll();
            i=head[0];
            j=head[1];

            if(visitedMatrix[i][j]) {
                continue;
            }
            visitedMatrix[i][j]=true;

            if(matrix[i][j]==0)
                continue;

            matrix[i][j]=2;

            List<int[]> neighbours = getNeighbours(i,j,matrix,visitedMatrix);
            queue.addAll(neighbours);

        }

    }

    private static List<int[]> getNeighbours(int i, int j, int[][] matrix, boolean[][] visitedMatrix) {
        List<int[]> neighbours = new ArrayList<>();

        if(i>0&&!visitedMatrix[i-1][j]&&matrix[i-1][j]==1) {
            neighbours.add(new int[]{i-1,j});
        }

        if(i<matrix.length-1&&!visitedMatrix[i+1][j] && matrix[i+1][j]==1) {
            neighbours.add(new int[]{i+1,j});
        }

        if(j>0&&!visitedMatrix[i][j-1]&&matrix[i][j-1]==1) {
            neighbours.add(new int[]{i,j-1});
        }

        if(j<matrix[0].length-1 && !visitedMatrix[i][j+1] && matrix[i][j+1]==1) {
            neighbours.add(new int[]{i,j+1});
        }

        return neighbours;
    }

    private static int[][] getMaxtrix() {
        int[][] array = new int[6][6];
        array[0][0] = 1;
        array[0][1] = 0;
        array[0][2] = 0;
        array[0][3] = 0;
        array[0][4] = 0;
        array[0][5] = 0;

        array[1][0] = 0;
        array[1][1] = 1;
        array[1][2] = 0;
        array[1][3] = 1;
        array[1][4] = 1;
        array[1][5] = 1;

        array[2][0] = 0;
        array[2][1] = 0;
        array[2][2] = 1;
        array[2][3] = 0;
        array[2][4] = 1;
        array[2][5] = 0;

        array[3][0] = 1;
        array[3][1] = 1;
        array[3][2] = 0;
        array[3][3] = 0;
        array[3][4] = 1;
        array[3][5] = 0;

        array[4][0] = 1;
        array[4][1] = 0;
        array[4][2] = 1;
        array[4][3] = 1;
        array[4][4] = 0;
        array[4][5] = 0;

        array[5][0] = 1;
        array[5][1] = 0;
        array[5][2] = 0;
        array[5][3] = 0;
        array[5][4] = 0;
        array[5][5] = 1;

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
