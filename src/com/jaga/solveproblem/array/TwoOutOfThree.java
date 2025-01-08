package com.jaga.solveproblem.array;

import java.util.*;
import java.util.stream.Collectors;

public class TwoOutOfThree {

    public static void main(String[] args) {
        int[] nums1= {1,4};
        int[] nums2= {2,4};
        int[] nums3= {2,5};
        List<Integer> result = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(result);

    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Set<Integer> result = new HashSet<>();
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> set3 = Arrays.stream(nums3).boxed().collect(Collectors.toSet());

        for (Integer num: set1) {
            if(set2.contains(num) || set3.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num: set2) {
            if(set3.contains(num)) {
                result.add(num);
            }
        }
//
//        Map<Integer, Integer> store = new HashMap<Integer, Integer>();
//
//        for(Integer num: set1) {
//            store.put(num, 1);
//        }
//
//        for(Integer num: set2) {
//          store.put(num,store.getOrDefault(num,0)+1);
//        }
//
//        for(Integer num: set3) {
//            store.put(num,store.getOrDefault(num,0)+1);
//
//        }
//
////        System.out.println(store);
//
//        List<Integer> result = store.entrySet().stream().filter(es -> es.getValue() >= 2).map(es -> es.getKey()).collect(Collectors.toList());
        return new ArrayList<>(result);
    }
}
