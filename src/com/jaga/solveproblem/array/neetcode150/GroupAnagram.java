package com.jaga.solveproblem.array.neetcode150;

import com.jaga.solveproblem.common.MyUtil;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        List<List<String>> results = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        results.forEach(anagrams-> {
            anagrams.forEach(System.out::print);
            System.out.println();
        });


    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        if(strs==null || strs.length==0)
            return new ArrayList<>();;

        Map<String,List<String>> store = new HashMap<>();
        for(String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!store.containsKey(key)) {
                store.put(key, new ArrayList<>());
            }

            store.get(key).add(str);
        }

        return new ArrayList<>(store.values());
    }

}
