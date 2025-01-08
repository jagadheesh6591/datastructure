package com.jaga.solveproblem.array.neetcode150;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

//        boolean isAnagram = isAnagram("anagram", "nagaram");
//        System.out.println(isAnagram);
//        boolean isAnagram1 = isAnagram("cat", "rat");
//        System.out.println(isAnagram1);
        boolean isAnagram2 = isAnagram("aacc", "ccac");
        System.out.println(isAnagram2);


    }

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) {
            return false;
        }

        Map<Character,Integer> store = new HashMap<>();

        for(Character c : s.toCharArray()) {
            store.put(c,store.getOrDefault(c,1)+1);
        }

        for(Character c : t.toCharArray()) {
            if(!store.containsKey(c)) {
                return false;
            }
            store.put(c,store.get(c)-1);
            if(store.get(c)<0) {
                return false;
            }
        }

        return true;
    }
}
