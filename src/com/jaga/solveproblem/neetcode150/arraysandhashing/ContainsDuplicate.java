package com.jaga.solveproblem.neetcode150.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
//        boolean containsDuplicate = containsDuplicate(new int[]{1, 2, 3, 1});
//        System.out.println(containsDuplicate);
//        boolean containsDuplicate1 = containsDuplicate(new int[]{1, 2, 3, 4});
//        System.out.println(containsDuplicate1);

        boolean containsDuplicate2 = containsDuplicateTest(new int[]{1, 2, 3, 3});
        System.out.println(containsDuplicate2);
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
          if(!store.add(nums[i])) {
              return true;
          }
        }
        return false;
    }

    public static boolean containsDuplicateTest(int[] nums) {

        Set<Integer> store = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(!store.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

}
