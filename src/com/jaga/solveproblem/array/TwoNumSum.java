package com.jaga.solveproblem.array;

import java.util.HashMap;

public class TwoNumSum {

    public static void main(String[] args) {

        int arr[] = {3,5,7,8,9,1,4};
        int target = 12;

        HashMap<Integer,Integer> store = new HashMap<>();

        for (int i = 0; i <arr.length; i++) {

            if(store.get(target-arr[i])!=null) {
                System.out.println(store.get(target-arr[i])+""+arr[i]);
            } else {
                store.put(arr[i],arr[i]);
            }

        }


    }
}
