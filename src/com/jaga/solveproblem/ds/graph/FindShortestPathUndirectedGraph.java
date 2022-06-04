package com.jaga.solveproblem.ds.graph;

import com.jaga.solveproblem.ds.queue.IntQueue;

import java.util.*;

public class FindShortestPathUndirectedGraph {

    public static void main(String[] args) {

        ConstructGraph constructGraph = new ConstructGraph(5);

        constructGraph.addEdge( 0, 1);
        constructGraph.addEdge(0, 4);
        constructGraph.addEdge(1, 2);
        constructGraph.addEdge( 1, 3);
        constructGraph.addEdge( 1, 4);
        constructGraph.addEdge(2, 3);
        constructGraph.addEdge( 3, 4);

        List<Integer> prev =  findBFS(0,2, constructGraph.getAdj());

    }
    // TODO to be continue
    private static List<Integer> findBFS(int startNode, int endNode, ArrayList<ArrayList<Integer>> adj) {

        IntQueue queue = new IntQueue(5);

        queue.enqueue(startNode);
        boolean[] visited = new boolean[5];

        return null;
    }

}
