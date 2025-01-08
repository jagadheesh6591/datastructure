package com.jaga.solveproblem.array.neetcode150;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        boolean containsDuplicate = containsDuplicate(new int[]{1, 2, 3, 1});
        System.out.println(containsDuplicate);
        boolean containsDuplicate1 = containsDuplicate(new int[]{1, 2, 3, 4});
        System.out.println(containsDuplicate1);
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
}
