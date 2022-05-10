package com.jaga.solveproblem.ds.problems;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};
        int b[] = {1,3,5,7,9,11};
        int result[] = mergeSortedArrays(a,b);
        printResult(result);
    }

    private static void printResult(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");

        }
    }

    private static int[] mergeSortedArrays(int[] a, int[] b) {
        int result[] = new int[a.length+b.length];
        int aSize = a.length;
        int bSize = b.length;
        int j=0;
        int k=0;
        for(int i=0;i<result.length;i++) {

            if(j<aSize&&k<bSize) {
                if(a[j]<b[k]) {
                    result[i]=a[j];
                    j++;
                } else {
                    result[i]=b[k];
                    k++;
                }
            } else if(j<aSize) {
                result[i]=a[j];
                j++;
            } else {
                result[i]=b[k];
                k++;
            }

        }

        System.out.println("current j value "+j);
        System.out.println("current k value "+k);
        Arrays.sort(a);
        return result;
    }

}
