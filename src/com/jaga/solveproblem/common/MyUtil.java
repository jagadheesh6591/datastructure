package com.jaga.solveproblem.common;

import java.util.Collection;
import java.util.Map;

public class MyUtil {

    public static <T extends Collection> void iterate(Collection<T> collection) {
        collection.forEach(a-> System.out.println(a));
    }

    public static <T extends Object> void iterateMap(Map<Character, T> charCounts) {
        charCounts.entrySet().forEach(System.out::println);
    }
}
