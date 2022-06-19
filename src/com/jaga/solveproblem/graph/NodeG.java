package com.jaga.solveproblem.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NodeG {

    String name;
    List<NodeG> children = new ArrayList<NodeG>();

    public NodeG(String name) {
        this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
        array.add(this.name);
        for(NodeG node : this.children) {
            node.depthFirstSearch(array);
        }

        return array;
    }

    public List<String> breadthFirstSearch(List<String> array) {

        Queue<NodeG> queue = new LinkedList<>();
        queue.add(this);

        while(!queue.isEmpty()) {
            queue.stream().map(node-> node.name).forEach(System.out::print);
            NodeG head = queue.poll();
            array.add(head.name);
            System.out.println();
            head.children.stream().map(node-> node.name).forEach(System.out::print);
            System.out.println();
            head.children.forEach(queue::add);
            System.out.println();

        }

        return array;
    }



    public NodeG addChild(String name) {
        NodeG child = new NodeG(name);
        this.children.add(child);
        return child;
    }
}
