package com.jaga.solveproblem.string;

import com.jaga.solveproblem.common.MyUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnderscorifySubstring {

    public static void main(String[] args) {
        String str = "abcabcabcabcabcabcabcabcabcabcabcabcabcabc";
        String substring="abc";

        MyUtil.printStringIndex(str);

        ArrayList<Integer[]> indexLists = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(checkSubString(str.substring(i,Math.min(str.length(),i+substring.length())),substring)) {
                Integer pair[] = {i,i+(substring.length()-1)};
                indexLists.add(pair);
            }
        }

        ArrayList<Integer[]> filterIndex = new ArrayList<>();
        Integer[] firstPair = indexLists.get(0);
        filterIndex.add(firstPair);
//        indexLists.forEach(element -> {
//            System.out.println(element[0]+" "+element[1]);
//        });

        for (int i = 1; i < indexLists.size(); i++) {
            getFilterList(indexLists.get(i),filterIndex);
        }

        firstPair[1]=firstPair[1]+1;
        filterIndex.add(0,firstPair);
//firstPair
        System.out.println("filter index values");
        filterIndex.forEach(element -> {
            System.out.println(element[0]+" "+element[1]);
        });


        List<Integer> flatFilterList = new ArrayList<>();
        for (int i = 0; i < filterIndex.size(); i++) {
            Integer[] pair = filterIndex.get(i);
            flatFilterList.add(pair[0]);
            flatFilterList.add(pair[1]);

        }

        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if(flatFilterList.contains(i)) {
                sb.append("_");
            }
            sb.append(str.charAt(i));
        }

        if(flatFilterList.contains(str.length()+1)) {
            sb.append("_");
        }

        System.out.println(sb.toString());


    }

    private static void getFilterList(Integer[] currentIndex, ArrayList<Integer[]> filterIndexResult){

        if (filterIndexResult==null || filterIndexResult.size()==0)
            return;

        Integer[] resultIndex = filterIndexResult.get(filterIndexResult.size() - 1);
        if(currentIndex[0]<=resultIndex[1]+1) {
            resultIndex[1]=currentIndex[1]+1;
        } else {
            currentIndex[1]=currentIndex[1]+1;
            filterIndexResult.add(currentIndex);
        }


    }

    private static boolean checkSubString(String str, String substring) {
        int i=0;
       while(i<str.length()) {
           if(str.charAt(i)!=substring.charAt(i)) {
               return false;
           }
           i++;
       }

       return true;
    }
}
