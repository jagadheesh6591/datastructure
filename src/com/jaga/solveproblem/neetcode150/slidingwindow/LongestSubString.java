package com.jaga.solveproblem.neetcode150.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
        // Test 1
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3

        // Test 2
        System.out.println(lengthOfLongestSubstring("bbbbb")); // 1

        // Test 3
        System.out.println(lengthOfLongestSubstring("pwwkew")); // 3

        // Test 4
        System.out.println(lengthOfLongestSubstring("")); // 0

        // Test 5
        System.out.println(lengthOfLongestSubstring("abcdef")); // 6

        // Test 6
        System.out.println(lengthOfLongestSubstring("dvdf")); // 3
    }

    private static int lengthOfLongestSubstring(String input) {

        Set<Character> store = new HashSet<>();
        int left =0;

        int result=0;

        for (int j = 0; j <input.length() ; j++) {

            Character rightChar = input.charAt(j);

            while(store.contains(rightChar)) {
                store.remove(input.charAt(left));
                left++;
            }

            store.add(rightChar);

            result = Math.max(result , j-left+1);

        }

        return result;
    }


}
