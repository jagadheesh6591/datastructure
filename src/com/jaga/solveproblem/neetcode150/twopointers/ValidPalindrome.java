package com.jaga.solveproblem.neetcode150.twopointers;

public class ValidPalindrome {

    public static void main(String[] args) {

        String input = "A man, a plan, a canal: Panama";

        boolean result = isValidPalindromeCheck(input);

        // Test Cases
        System.out.println(isValidPalindromeCheck("A man, a plan, a canal: Panama")); // true
        System.out.println(isValidPalindromeCheck("race a car")); // false
        System.out.println(isValidPalindromeCheck(" ")); // true
        System.out.println(isValidPalindromeCheck("ab_a")); // true
        System.out.println(isValidPalindromeCheck("0P")); // false

    }

    private static boolean isValidPalindromeCheck(String input) {

        String lowCase = input.toLowerCase();
        int i=0,j=lowCase.length()-1;

        while(i<j) {

            while(i<j&&!Character.isLetterOrDigit(lowCase.charAt(i))){
                i++;
            }
            while(i<j&&!Character.isLetterOrDigit(lowCase.charAt(j))){
                j--;
            }

            if(lowCase.charAt(i)!=lowCase.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
