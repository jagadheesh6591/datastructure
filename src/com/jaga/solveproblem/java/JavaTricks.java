package com.jaga.solveproblem.java;

public class JavaTricks {


    public static void main(String[] args) {
        booleanAssignment();
    }

    private static void booleanAssignment() {
        boolean a = true;
        boolean b = false;
        if(b=a) {
            System.out.println("print true");
        } else {
            System.out.println("Print false");
        }
    }
}
