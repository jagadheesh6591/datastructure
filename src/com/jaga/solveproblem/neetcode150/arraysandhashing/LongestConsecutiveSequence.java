package com.jaga.solveproblem.neetcode150.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
//        int longerStreak = longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
//        System.out.println(longerStreak);
        int longerStreak1 = longestConsecutive(new int[]{100,4,200,1,3,2});
        System.out.println(longerStreak1);

        int longerStreak2 = longestConsecutiveTest(new int[]{100,4,200,1,3,2});
        System.out.println(longerStreak2);
    }

    public static int longestConsecutive(int[] nums) {
        int longestStreak=0;

        Set<Integer> store = new HashSet<>(nums.length);
        for (int num: nums) {
            store.add(num);
        }

        for(int num : store) {
            int currentNumber = num;
            int currentSteak=1;
            if(!store.contains(num-1)){

                while(store.contains(currentNumber+1)) {
                    currentNumber++;
                    currentSteak++;
                }

                longestStreak = Math.max(currentSteak,longestStreak);

            }

        }

        return longestStreak;
    }

    public static int longestConsecutiveTest(int[] nums) {
        Integer result=0;
        Set<Integer> store = new HashSet<>();
        for(Integer num : nums) {
            store.add(num);
        }

        for(Integer num : nums) {
            Integer currentNumber = num;
            Integer streak=1;
            if(!store.contains(num-1)) {

                while(store.contains(currentNumber+1)) {
                    streak++;
                    currentNumber++;
                }

                result = Math.max(streak,result);

            }

        }

        return result;

    }
}
