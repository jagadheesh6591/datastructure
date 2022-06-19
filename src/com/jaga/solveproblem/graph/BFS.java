package com.jaga.solveproblem.graph;

import com.jaga.solveproblem.common.MyUtil;

import java.util.ArrayList;
import java.util.List;

public class BFS {

    public static void main(String[] args) {

        NodeG node = new NodeG("A");
        NodeG b = node.addChild("B");
        node.addChild("C");
        NodeG d = node.addChild("D");

        b.addChild("E");
        NodeG f = b.addChild("F");
        f.addChild("I");
        f.addChild("J");

        NodeG g = d.addChild("G");
        g.addChild("k");
        d.addChild("H");

        List<NodeG> children = node.children;

        List<String> strings = node.breadthFirstSearch(new ArrayList<>());
        MyUtil.print(strings);

    }


}
