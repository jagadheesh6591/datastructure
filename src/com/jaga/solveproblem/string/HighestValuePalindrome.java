package com.jaga.solveproblem.string;

import java.util.HashSet;

public class HighestValuePalindrome {

    public static void main(String[] args) {
        String str = "932239";
        String reverseString = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reverseString));

        StringBuilder strB = new StringBuilder(str);

        int n=str.length();
        int k=2;

        getHighValuePalindrome(str, strB, n, k);

    }

    private static String getHighValuePalindrome(String str, StringBuilder strB, int n, int k) {
        HashSet<Integer> visitedStore = new HashSet<>(n/2);

        for(int i = 0; i< n /2; i++) {

            if(str.charAt(i)!= str.charAt(n-i-1)) {
                int max = Math.max(Integer.valueOf(str.charAt(i)), str.charAt(n - i - 1));
                strB.setCharAt(i, (char) max);
                strB.setCharAt(n-i-1, (char) max);
                visitedStore.add(i);
                k = k-1;

                if(k <0){
                    System.out.println("-1");
                    return "-1";
                }
            }
        }

        for(int i=0;i<n/2;i++) {
            if(k>0) {
                if (visitedStore.contains(i)) {

                    if (strB.charAt(i) == '9') {
                        continue;
                    } else {
                        strB.setCharAt(i, '9');
                        strB.setCharAt(n-i-1, '9');
                        k=k-1;
                    }

                } else if(k>1) {
                    if (strB.charAt(i) == '9') {
                        continue;
                    } else {
                        strB.setCharAt(i, '9');
                        strB.setCharAt(n - i - 1, '9');
                        k = k - 2;
                    }
                }
            }

        }

        if(k>0 && n%2==1) {
            strB.setCharAt(n/2, '9');
        }

        System.out.println(strB.toString());
        return strB.toString();
    }

    boolean isPalindrome(String str) {
        String reverseString = new StringBuilder(str).reverse().toString();
        return str.equals(reverseString);
    }
}
