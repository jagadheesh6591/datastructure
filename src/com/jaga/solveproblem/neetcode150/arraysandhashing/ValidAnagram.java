package com.jaga.solveproblem.neetcode150.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

//        boolean isAnagram = isAnagram("anagram", "nagaram");
//        System.out.println(isAnagram);
//        boolean isAnagram1 = isAnagram("cat", "rat");
//        System.out.println(isAnagram1);
//        boolean isAnagram2 = isAnagram("aacc", "ccac");
//        System.out.println(isAnagram2);

        boolean isAnagram3 = isAnagramTest("carrace", "racecar");
        System.out.println(isAnagram3);


    }

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagramWithHash(String s, String t) {

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
    public static boolean isAnagramTest(String s, String t) {
        if(s.length()!=t.length())
            return false;

        Map<Character, Integer> store  = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            store.put(s.charAt(i), store.getOrDefault(s.charAt(i),0)+1);
        }

        for(int j=0;j<t.length();j++) {
            if(!store.containsKey(t.charAt(j))) {
                return false;
            }

            store.put(t.charAt(j), store.get(t.charAt(j))-1);

            if(store.get(t.charAt(j))<0) {
                return false;
            }
        }

        return true;
    }
}
