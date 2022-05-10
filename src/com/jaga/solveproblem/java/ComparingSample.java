package com.jaga.solveproblem.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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


        books.stream().sorted(Comparator.comparing(Book::getId).thenComparing(Book::getSubId)).forEach(result -> System.out.println(result));


        /*Collections.sort(books);

        for(Book book : books) {
            System.out.println(book);
        }*/



        //MyUtil.iterate(books);







    }
}
