package com.jaga.solveproblem.graph;

import java.util.ArrayList;

public class CycleInDirectedGraph {

    public static void main(String[] args) {

        int[][] edges = {{1,3},{2,3,4},{0},{},{2,5},{}};

        for (int i = 0; i < edges.length; i++) {
            System.out.println();
            for (int j = 0; j < edges[i].length; j++) {
                System.out.print(" "+edges[i][j]);
            }
            System.out.println();
        }

        boolean b = new CycleInDirectedGraph().cycleInGraph(edges);
        System.out.println(b);

    }

    public boolean cycleInGraph(int[][] edges) {
        boolean[] visitedVertices = new boolean[edges.length];
        boolean[] stackedVertices = new boolean[edges.length];

        for (int i = 0; i < edges.length; i++) {

                if(visitedVertices[i]) {
                    continue;
                }

            boolean cycleCheck = doDFSCycleCheck(edges, i, visitedVertices, stackedVertices);
            if(cycleCheck)
                return true;
        }

        return false;
    }

    private boolean doDFSCycleCheck(int[][] edges, Integer i, boolean[] visitedVertices, boolean[] stackedVertices) {

        visitedVertices[i]=true;
        stackedVertices[i]=true;

        for (int node : edges[i]) {

            if(stackedVertices[node])
                return true;
            else if(visitedVertices[node]) {
                continue;
            }

            stackedVertices[node]=true;
            boolean cycleCheck = doDFSCycleCheck(edges, node, visitedVertices, stackedVertices);
            if(cycleCheck)
                return true;
        }

        stackedVertices[i]=false;
        return false;
    }
}
