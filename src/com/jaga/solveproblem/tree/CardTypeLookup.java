package com.jaga.solveproblem.tree;

import com.jaga.solveproblem.common.MyUtil;
import com.jaga.solveproblem.tree.pojo.BINRange;
import com.jaga.solveproblem.tree.pojo.BinRangeTreeNode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CardTypeLookup {
    public static void main(String[] args) {

        BINRange visa = new BINRange("300000000000","399999999999","VISA" );
        BINRange master = new BINRange("400000000000","499999999999","MASTER" );
        BINRange mastro = new BINRange("500000000000","599999999999","MASTRO" );
        BINRange amex = new BINRange("600000000000","699999999999","AMEX" );
        BINRange paypal = new BINRange("700000000000","799999999999","PAYPAL" );
        BINRange rupay = new BINRange("800000000000","899999999999","RUPAY" );
        BINRange amazonPay = new BINRange("900000000000","999999999999","AMAZONPAY" );

        List<BINRange> binRanges = Arrays.asList(visa, master, mastro, amex, paypal, rupay, amazonPay);
        Map<Long, BINRange> binRangeWithMap = binRanges.stream().collect(Collectors.toMap(binRange ->
                Long.valueOf( binRange.getEnd()) + Long.valueOf( binRange.getStart())/2, Function.identity()));


        Long[] binRangeWithStarts = binRangeWithMap.keySet().toArray(new Long[binRangeWithMap.size()]);
        Arrays.sort(binRangeWithStarts);
        BinRangeTreeNode binRangeTreeNode = ConstructBBT(binRangeWithStarts, 0, binRangeWithStarts.length - 1);
        LinkedList<Long> inOrderList =  new LinkedList<>();
        inOrderTraversal(binRangeTreeNode, inOrderList);
        MyUtil.print(inOrderList);

        BinRangeTreeNode cardType = findCardType(binRangeTreeNode, "800000000111");
        System.out.println(cardType.val);


    }

    private static BinRangeTreeNode findCardType(BinRangeTreeNode binRangeTreeNode, String binValue) {
        long minDiff = Long.MAX_VALUE;
        long searchValue = Long.valueOf(binValue);
        BinRangeTreeNode closestNode=null;
        while(binRangeTreeNode!=null ) {

            long diff = Math.abs(binRangeTreeNode.val - searchValue);

            if(diff < minDiff) {
                closestNode=binRangeTreeNode;
                minDiff=diff;
            }

            if(searchValue>binRangeTreeNode.val) {
                binRangeTreeNode = binRangeTreeNode.right;
            } else {
                binRangeTreeNode = binRangeTreeNode.left;
            }

        }

        return closestNode;

    }

    private static Long bfs(BinRangeTreeNode binRangeTreeNode, Long binValue, long minDiff, long minDifferenceKey,BinRangeTreeNode minDiffKey) {

        if(binRangeTreeNode==null){
            return null;
        }

        if(binRangeTreeNode.val==binValue) {
            minDifferenceKey = binRangeTreeNode.val;
            minDiffKey = binRangeTreeNode;
            return minDifferenceKey;
        }

        if(minDiff> Math.abs(binRangeTreeNode.val-binValue)) {
            minDiff=Math.abs(binRangeTreeNode.val-binValue);
            minDifferenceKey=binRangeTreeNode.val;
            minDiffKey = binRangeTreeNode;

        }

        if(binValue>binRangeTreeNode.val) {
           return bfs(binRangeTreeNode.left,binValue,minDiff,minDifferenceKey,minDiffKey);
        } else {
           return bfs(binRangeTreeNode.right,binValue,minDiff,minDifferenceKey,minDiffKey);
        }



    }

    private static void inOrderTraversal(BinRangeTreeNode binRangeTreeNode, LinkedList<Long> result) {

        if(binRangeTreeNode==null) {
            return;
        }

        inOrderTraversal(binRangeTreeNode.left,result);
        result.add( binRangeTreeNode.val);
        inOrderTraversal(binRangeTreeNode.right,result);

    }

    private static BinRangeTreeNode ConstructBBT(Long[] n, int start, int end) {

        if(start>end){
            return null;
        }

        int mid = (start+end)/2;
        BinRangeTreeNode node = new BinRangeTreeNode(n[mid]);
        node.left = ConstructBBT(n,start,mid-1);
        node.right = ConstructBBT(n,mid+1,end);

        return node;
    }


}
