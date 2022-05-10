package com.jaga.solveproblem.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            List<Integer> result = Stream.of(1, 2, 3, 4)
                    .peek(x -> list.add(x))
                    .map(x -> x * 2)
                    .filter(x -> x > 3)
                    .collect(Collectors.toList());

            long howMany = Stream.of(1, 2, 3, 4)
                    .peek(x -> list.add(x))
                    .count();

            System.out.println(howMany);

            print(list);
            print(result);

            

    }

    private static void print(List<Integer> list) {
        list.forEach(i-> System.out.println(i));
    }
}
