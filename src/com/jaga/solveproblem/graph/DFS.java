package com.jaga.solveproblem.graph;

import com.jaga.solveproblem.common.MyUtil;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static void main(String[] args) {

        NodeG NodeG = new NodeG("A");
        NodeG b = NodeG.addChild("B");
        b.addChild("E");
        NodeG f = b.addChild("F");
        f.addChild("I");
        f.addChild("J");
        NodeG.addChild("C");
        NodeG d = NodeG.addChild("D");
        NodeG g = d.addChild("G");
        g.addChild("k");
        d.addChild("H");

        List<String> strings = NodeG.depthFirstSearch(new ArrayList<>());
        MyUtil.print(strings);

    }
}
