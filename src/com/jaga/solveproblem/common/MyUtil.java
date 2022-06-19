package com.jaga.solveproblem.common;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MyUtil {

    public static <T extends Collection> void iterate(Collection<T> collection) {
        collection.forEach(a-> System.out.println(a));
    }

    public static <T extends Object> void iterateMap(Map<Character, T> charCounts) {
        charCounts.entrySet().forEach(System.out::println);
    }

    public static <T extends Object> void print(List<T> list) {
        for (T item : list) {
            System.out.print(" "+item);
        }
    }

    public static void printStringIndex(String str) {
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            if(i>8)
                System.out.print(str.charAt(i)+"  ");
            else
                System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

    }
}
