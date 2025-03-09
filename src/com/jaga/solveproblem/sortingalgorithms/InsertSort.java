package com.jaga.solveproblem.sortingalgorithms;

import com.jaga.solveproblem.common.MyUtil;

public class InsertSort {

    public static void main(String[] args) {

        int a[] = {9,5,2,4,7,1,3,6};

        MyUtil.print(a);

        for (int i = 1; i < a.length; i++) {

            int temp = a[i];
            int j = i-1;


            while(j>=0 && temp < a[j]) {
                a[i] = a[j];
                j--;
            }
            a[j+1] = temp;

        }

        MyUtil.print(a);
    }
}
