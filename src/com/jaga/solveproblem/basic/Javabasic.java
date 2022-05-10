package com.jaga.solveproblem.basic;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Javabasic {

    public static void main(String[] args) {



 /*       Test test1 = new Test(1,2);
        Test test2 = test1;

        System.out.println(test1==test2);
        System.out.println(test1.equals(test2));

        Test test3 = new Test(1,2);

        System.out.println(test3.equals(test1)); // it would be false if we havent overrided equals method
        java8();*/

    }

    private static void java8() {

        String[] str;


        Map<String,String> map = new HashMap<>();

        List<Integer> integers = Arrays.asList(2, 4, 5, 1, 3);
        integers.stream().sorted().forEach(a-> System.out.print(a));
        Integer integer = integers.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()).get(1);
        System.out.println(integer);

    }

}
