package com.jaga.solveproblem.java;

public interface Test {
    default void a() {
        System.out.println("Inside a");
    };
    default void b() {
        System.out.println("inside b");
    }
}
