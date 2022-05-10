package com.jaga.solveproblem.basic;

public class SecondBig {

    public static void main(String[] args) {

        int a[] = {12, 35, 1, 10, 34, 1};
        int first = a[0],second=a[0];

        for(int i=0;i<a.length;i++) {
            if(a[i]>first) {
                second=first;
                first=a[i];
            } else if(a[i]>second && a[i]!=first) {
                second=a[i];
            }

        }
        System.out.println(second);

    }
}
