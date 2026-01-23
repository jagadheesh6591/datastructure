package com.jaga.solveproblem.string;

import java.util.HashMap;

public class LongestSubStringNoDuplicateLetter {

    public static void main(String[] args) {

        String str  = "jagadeesh";

        String longSubStr= str.substring(0,1);
        int leftIdx=0;
        HashMap<Character,Integer> store = new HashMap<>();

        for (int idx = 0; idx < str.length(); idx++) {

            if(store.get(str.charAt(idx))!=null) {
                leftIdx=Math.max(leftIdx,store.get(str.charAt(idx))+1);
                if(longSubStr.length()<str.substring(leftIdx,idx+1).length()){
                    longSubStr=str.substring(leftIdx,idx+1);
                }
            }
            store.put(str.charAt(idx),idx);
        }

        System.out.println(longSubStr);


    }

}
