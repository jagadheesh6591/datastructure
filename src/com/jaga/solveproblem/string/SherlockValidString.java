package com.jaga.solveproblem.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SherlockValidString {

    public static void main(String[] args) {
        boolean isValid = true;
        String s = "abcdefghhgfedecba";
        int allowedCount=2;
        int count=0;
        HashMap<Integer,Integer> occuranceStore = new HashMap<>();

        while(s.length()>0) {
            Character c = s.charAt(0);
            Integer occurrence = s.length()-s.replace(s.substring(0,1),"").length();
            //System.out.println(c + " " +occurrence);
            if(occuranceStore.get(occurrence)!=null) {
                occuranceStore.put(occurrence,occuranceStore.get(occurrence)+1);
            } else {
                occuranceStore.put(occurrence,0);
            }

            if(occuranceStore.size()>2) {
                isValid=false;
            }

            s = s.replaceAll(s.substring(0,1),"");
        }




        occuranceStore.forEach((a,b)-> System.out.println(a + " " + b));

        System.out.println(isValid);

    }
}
