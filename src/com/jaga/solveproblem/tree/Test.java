package com.jaga.solveproblem.tree;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //List<String> strings = packNumbers(Arrays.asList( 255,255, 7, 7, 3, 4, 7));
        //System.out.println(strings);
        System.out.println(getLuckyFloorNumber(123));
    }


    static int getLuckyFloorNumber(int n) {

        int result=0;
        int counter=0;
        for (int i = 1; counter < n; i++) {

           if(!getLuckyNumber(i)) {
               counter++;
               result=i;
           }

        }

        return result;

    }

    static boolean getLuckyNumber(int n) {

        if(n>13) {

            if(n==123){
                System.out.println(n);
            }
            int mod = n%10;
            int firstLastCombo=0;
            if(mod!=0) {
                firstLastCombo= n-mod*10;
            }

            if(is4or13(mod)||is4or13(firstLastCombo)) {
                return true;
            } else {
                return getLuckyNumber(firstLastCombo);
            }
        } else {
            return is4or13(n);
        }

    };
    
    static boolean is4or13(int x) {

        if(x==4 || x==13) {
            return true;
        }
        return false;
    }

    static List<String> packNumbers(List<Integer> arr) {

        int n = arr.size(),i=0;
        List<String> result = new ArrayList<>();

        while(i<n) {
            int counter=1;


            while(i<n && i+1<n && arr.get(i).equals(arr.get(i+1))) {
                counter++;
                i++;
            }

            if(counter>1) {
                String temp = String.valueOf(arr.get(i))+":"+ String.valueOf(counter);
                result.add(temp);
                i++;
            } else {
                result.add(String.valueOf(arr.get(i)));
                i++;
            }

        }

        return result;

    }
}
