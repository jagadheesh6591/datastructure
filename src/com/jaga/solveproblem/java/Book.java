package com.jaga.solveproblem.java;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", subId=" + subId +
                ", name='" + name + '\'' +
                '}';
    }

    int id;
    int subId;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(int id, int subId, String name) {
        this.id = id;
        this.subId = subId;
        this.name = name;
    }

    @Override
    public int compareTo(Book book) {
      return Comparator.comparing(Book::getId)
              .thenComparing(Book::getSubId)
              .compare(this,book);
    }
}
