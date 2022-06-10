package com.jaga.solveproblem.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<BinRange> binRanges = new ArrayList<>();

        CardCache cache =  buildCache(binRanges);

        String cardNumber="1212121";

        CardCache result = cardNumber1 ->  cardNumber1+"test" ;
        String test = result.get(cardNumber);

        System.out.println(test);


    }

    private static CardCache buildCache(List<BinRange> binRanges) {

        TreeMap<Long,String> cache = new TreeMap<Long,String>();
        TreeNode rootNode = null;

        Map<Long, BinRange> binRangeWithMap = binRanges.stream().collect(Collectors.toMap(binRange ->
                Long.valueOf(binRange.start), Function.identity()));
        Long[] objects = (Long[]) binRangeWithMap.entrySet().toArray();


        for(BinRange binRange : binRanges) {
            cache.put((Long.valueOf(binRange.start)+Long.valueOf(binRange.end))/2,binRange.cardType);

            TreeNode root = new TreeNode((Long.valueOf(binRange.start)+Long.valueOf(binRange.end))/2);
            TreeNode right = new TreeNode(Long.valueOf(binRange.end));
            TreeNode left = new TreeNode(Long.valueOf(binRange.start));
            root.left=left;
            root.right=right;
            if(rootNode==null) {
                rootNode=root;
            } else {
                if(rootNode.val < root.val) {
                    root.left.left=rootNode;
                    rootNode=root;
                } else {
                    root.right.right=rootNode;
                    rootNode=root;
                }
            }
        }
        
        return new CardCache() {
            @Override
            public String get(String cardNumber) {
                
                return cache.get(cardNumber);
            }
            
        };
    }

    static final class BinRange {
        final String start;
        final String end;
        final String cardType;

        BinRange(String start, String end, String cardType) {
            this.start = start;
            this.end = end;
            this.cardType = cardType;
        }


    }

    static final class TreeNode {
        long val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(long val) { this.val = val; }
        TreeNode(long val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
