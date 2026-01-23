package com.jaga.solveproblem.neetcode150.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationsInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo")); // true
    }

    private static boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length())
            return false;

        Map<Character,Integer> s1Store = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Store.put(s1.charAt(i),s1Store.getOrDefault(s1.charAt(i),0)+1);
        }

        Map<Character,Integer> s2Store = new HashMap<>();
        for (int j = 0; j <s2.length(); j++) {
            s2Store.put(s2.charAt(j),s2Store.getOrDefault(s2.charAt(j),0)+1);

            if(j>=s1.length()) {
                int leftCharIndex = j-s1.length();
                s2Store.put(s2.charAt(leftCharIndex), s2Store.get(s2.charAt(leftCharIndex))-1);

                if(s2Store.get(s2.charAt(leftCharIndex))==0){
                    s2Store.remove(s2.charAt(leftCharIndex));
                }
            }

            if(s1Store.equals(s2Store)) {
                return true;
            }


         }
        return false;
    }
}
