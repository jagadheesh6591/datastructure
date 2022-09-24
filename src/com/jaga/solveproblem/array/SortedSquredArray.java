package com.jaga.solveproblem.array;

import com.jaga.solveproblem.common.MyUtil;

import java.util.Arrays;

public class SortedSquredArray {

    public static void main(String[] args) {
        int[] array = {-6,1,3,5};
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i]*array[i];
        }

        MyUtil.print(result);
        Arrays.sort(result);
        MyUtil.print(result);

        twoPointerOptimal(array);

    }

    private static void twoPointerOptimal(int[] array) {
        int[] result = new int[array.length];
        int i =0,j=array.length-1,k= array.length-1;

        while(i<=j) {
            if(Math.abs(array[i])>Math.abs(array[j])) {
                result[k]= array[i] * array[i];
                k--;
                i++;
            } else {
                result[k] = array[j] * array[j];
                j--;
                k--;
            }
        }

        MyUtil.print(result);


    }
}
