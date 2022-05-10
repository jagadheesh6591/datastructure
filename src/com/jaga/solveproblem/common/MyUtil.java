package com.jaga.solveproblem.common;

import java.util.Collection;

public class MyUtil {

    public static <T extends Collection> void iterate(Collection<T> collection) {
        collection.forEach(a-> System.out.println(a));
    }
}
