package com.jaga.solveproblem.graph;

public class NoOfIsland {

    public static void main(String[] args) {

        int[][] grid = getMaxtrix();
        int numIslands = numIslands(grid);
        System.out.println(numIslands);


    }

    public static int numIslands(int[][] grid) {
        int islandCount=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if(grid[i][j]==1) {
                    islandCount++;
                    dfs(grid,i,j);
                }

            }
        }

        return islandCount;
    }

    private static void dfs(int[][] grid, int i, int j) {

        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0)
            return;

        grid[i][j]=0;

        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);

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
