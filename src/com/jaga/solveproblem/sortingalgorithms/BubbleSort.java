package com.jaga.solveproblem.sortingalgorithms;

import com.jaga.solveproblem.common.MyUtil;

public class BubbleSort {

    public static void main(String[] args) {
        int a[] = {9,5,2,4,7,1,3,6};

        MyUtil.print(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]<a[j]) {
                   int temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
        }

        MyUtil.print(a);
    }
}


