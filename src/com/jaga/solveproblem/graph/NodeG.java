package com.jaga.solveproblem.graph;

import java.util.ArrayList;
import java.util.List;

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

    public NodeG addChild(String name) {
        NodeG child = new NodeG(name);
        children.add(child);
        return this;
    }
}
