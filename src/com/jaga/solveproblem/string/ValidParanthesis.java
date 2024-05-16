package com.jaga.solveproblem.string;

import java.util.*;

public class ValidParanthesis {

    public static void main(String[] args) {
        String input="()[]{}";
        Boolean valid = isValid(input);
        System.out.println(String.format( "Given input %s is valid %s",input, valid));
    }

    private static Boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> store = new HashMap<>();
        store.put('(',')');
        store.put('{','}');
        store.put('[',']');

        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if(store.containsKey(c)) {
                stack.push(c);
            } else {
                Character top = stack.isEmpty() ? '#' : stack.pop();
                if(c!=store.get(top)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
