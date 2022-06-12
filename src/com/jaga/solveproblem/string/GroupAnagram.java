package com.jaga.solveproblem.string;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp");
        List<List<String>> result = groupAnagrams(strings);
//        result.forEach( angramGroup -> {
//            angramGroup.forEach(System.out::print);
//        });

    }

    public static List<List<String>> groupAnagrams(List<String> words) {

        HashMap<String,String> store = new HashMap<>();
        words.forEach(word -> {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            store.put(word,String.valueOf(chars));
        });

        List<List<String>> anagramGroup = new ArrayList<>();
        HashMap<String,Integer> angramTrack = new HashMap<>();
        int index=0;

        for(Map.Entry<String,String> entry:store.entrySet()) {

            if(angramTrack.get(entry.getValue())==null) {
                List<String> entryList = new ArrayList<>();
                entryList.add(entry.getKey());
                angramTrack.put(entry.getValue(),index);
                anagramGroup.add(entryList);
                index++;
            } else {
                Integer indexA = angramTrack.get(entry.getValue());
                List<String> ang = anagramGroup.get(indexA);
                ang.add(entry.getKey());
            }
        }

        return anagramGroup;
    }
}
