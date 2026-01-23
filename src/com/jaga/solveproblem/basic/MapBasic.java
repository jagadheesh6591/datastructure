package com.jaga.solveproblem.basic;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {
    public static void main(String[] args) {

        Map<Character, Integer> s1Freq = new HashMap<>();
        s1Freq.put('a',2);
        s1Freq.put('b',2);
        Map<Character, Integer> s2Freq = new HashMap<>();
        s2Freq.put('a',2);
        s2Freq.put('b',2);

        System.out.println(s1Freq.equals(s2Freq));
    }
}
