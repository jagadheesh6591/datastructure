package com.jaga.solveproblem.string;

import com.jaga.solveproblem.common.MyUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonCharacters {

    public static void main(String[] args) {

        String input[] = {"abc", "abcd", "bcerqert"};
      //  String result[] = commonChars(input);


//        char[] chars = "jagadeesh".toCharArray();
//        Map<Character, Long> collect = "jagadeesh".chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
//        MyUtil.iterateMap(collect);
       // HashMap<Character,Integer> store = new HashMap<>();
        Map<Character, Long> store = Arrays.stream(input).flatMapToInt(str -> str.chars().distinct()).mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        MyUtil.iterateMapWithCharKey(store);
        String[] result = store.entrySet().stream().filter(es -> es.getValue() == input.length).map(es -> String.valueOf(es.getKey())).toArray(String[]::new);
        MyUtil.print(result);

        Map<Character, Integer> storeRaw = new HashMap<>();
        Map<String, Integer> storeRawString = new HashMap<>();
        for(String str : input) {
           // String[] uniqueCharacters = Stream.of(str.toCharArray()).map(ch -> String.valueOf(ch)).distinct().toArray(String[]::new);
            String[] uniqueCharacters = str.chars().mapToObj(ch -> (char) ch).distinct().map(String::valueOf).toArray(String[]::new);
            for(String uStr : uniqueCharacters) {
                storeRawString.put(uStr,storeRawString.getOrDefault(uStr,0)+1);
            }
//            Set<Character> uniqueChars = new HashSet<>();
//           for(Character c : str.toCharArray()) {
//               if(!uniqueChars.contains(c)) {
//                   uniqueChars.add(c);
//                   storeRaw.put(c,storeRaw.getOrDefault(c,0)+1);
//               }
//           }
        }

        String[] results = new String[]{};
        Set<String> resultSet = new HashSet<>();

        for(Map.Entry<String,Integer> entrySet : storeRawString.entrySet()) {

            if(entrySet.getValue()==input.length)
                resultSet.add(entrySet.getKey());

        }

        String[] objects = resultSet.toArray(new String[0]);
        MyUtil.print(objects);

        MyUtil.iterateMapWithStringKey(storeRawString);



    }

    private static String[] commonChars(String[] input) {
        String potentialChars = findSmallestString(input);
        Set<Character> potentialCharsSet = potentialChars.chars().mapToObj(c -> (char) c).distinct().collect(Collectors.toSet());

        for (String str: input) {

        }
        System.out.println(potentialChars);

        potentialCharsSet.forEach(System.out::print);
        String[] result = (String[]) potentialCharsSet.toArray();
        return result;
    }

//    private static void removeNonExistantChars(String input, Set<Character> potentialChars) {
//
//        Set<Character> inputSet = input.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
//
//        inputSet.forEach( c-> {
//                if(potentialChars.cont)
//        } );
//    }

    private static String findSmallestString(String[] input) {
        Optional<String> min = Arrays.stream(input).min(Comparator.comparing(String::length));
        String potentialCommonString = min.get();
        return potentialCommonString;
    }
}
