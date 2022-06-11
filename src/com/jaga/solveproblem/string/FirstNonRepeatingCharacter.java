package com.jaga.solveproblem.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        
        String str = "abcdacd";
        
        int index = findFirstNonRepeatingCharacter(str);
        System.out.println(index);
        
    }

    private static int findFirstNonRepeatingCharacter(String string) {

        HashMap<Character,Integer> store = new HashMap<>();
        int i=0,n=string.length();
            while(i<n) {
                if(store.get(string.charAt(i))!=null) {
                    store.put(string.charAt(i),store.get(string.charAt(i))+1);
                } else {
                    store.put(string.charAt(i),1);
                }
                
                i++;
            }


        Optional<Map.Entry<Character, Integer>> first = store.entrySet().stream().filter(storeEntrySet -> storeEntrySet.getValue() == 1).findFirst();

        if(first.isPresent()) {
            return string.indexOf( first.get().getKey());
        } else {
           return -1;
        }

    }
}
