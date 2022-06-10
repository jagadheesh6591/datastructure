package com.jaga.solveproblem.array;

import java.util.Arrays;
import java.util.List;

public class ValidateSubSequence {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(4, 5, 1, 22, 25, 6, -1, 8, 10);
        System.out.println(isValidSubsequence(array,sequence));


    }

    public boolean isSubsequence(String s, String t) {
        return false;
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int k=0;
        int i=0;
        while(i<array.size()&&k<sequence.size() ) {

            if(array.get(i)==sequence.get(k)) {
                k++;
            }
            i++;
        }

        return k+1==sequence.size();
    }
}
