package com.jaga.solveproblem.array;

public class ArrayManipulation {

    public static void main(String[] args) {

        int a[][]={{1,2,100},{2,4,100},{4,5,100}};

        print(a);
        
        findLargestValue(a);



    }

    private static int findLargestValue(int[][] a) {
        int largestValueCount = 0 ;
        int start=0;
        int end=0;
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//
//                if(a[i])
//
//            }
//        }



        return 0;
    }

    private static void print(int[][] a) {
        System.out.println(a.length);
        System.out.println("Print array");
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
