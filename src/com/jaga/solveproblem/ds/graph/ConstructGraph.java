package com.jaga.solveproblem.ds.graph;

import java.util.ArrayList;

public class ConstructGraph {

    private Integer vertex;
    private ArrayList<ArrayList<Integer>> adj;

    public ArrayList<ArrayList<Integer>> getAdj() {
        return this.adj;
    }

    public ConstructGraph(Integer v) {

        this.vertex=v;
        this.adj= new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++)
            this.adj.add(new ArrayList<Integer>());
    }

    public static void main(String[] args) {

        ConstructGraph constructGraph = new ConstructGraph(5);

        constructGraph.addEdge( 0, 1);
        constructGraph.addEdge(0, 4);
        constructGraph.addEdge(1, 2);
        constructGraph.addEdge( 1, 3);
        constructGraph.addEdge( 1, 4);
        constructGraph.addEdge(2, 3);
        constructGraph.addEdge( 3, 4);

        constructGraph.printGraph();

    }

    public void printGraph() {
        for (int i = 0; i < this.adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex"
                    + i);
            System.out.print("head");
            for (int j = 0; j < this.adj.get(i).size(); j++) {
                System.out.print(" -> "
                        + this.adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    //undirected graph
    public void addEdge(int u, int v) {
        this.adj.get(u).add(v);
        this.adj.get(v).add(u);
    }

}
