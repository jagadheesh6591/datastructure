package com.jaga.solveproblem.java;

import com.jaga.solveproblem.common.MyUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ComparingSample {

    public static void main(String[] args) {
        Book book1 = new Book(1,1,"ponniyin selvan");
        Book book2 = new Book(2,2,"parthiban kanavu 2");
        Book book21 = new Book(2,1,"parthiban kanavu 1");
        Book book3 = new Book(3,1,"sivagamiyin sabadham");

        List<Book> books = Arrays.asList(book3, book1, book2,book21);

        for(Book book : books) {
            System.out.println(book);
        }
        
        //sorting
        books.stream().sorted(Comparator.comparing(Book::getId).thenComparing(Book::getSubId)).forEach(result -> System.out.println(result));


        Map<String, Book> collect1 = books.stream().collect(Collectors.toMap(Book::getName, Function.identity()));
        for (Map.Entry<String, Book> stringBookEntry : collect1.entrySet()) {
            System.out.println(stringBookEntry.getKey()+"="+stringBookEntry.getValue());
        }


        char[] chars = "jagadeesh".toCharArray();
        Map<Character, Long> collect = "jagadeesh".chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        MyUtil.iterateMap(collect);


    }
}
