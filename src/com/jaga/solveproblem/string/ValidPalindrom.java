package com.jaga.solveproblem.string;

public class ValidPalindrom {

    public static void main(String[] args) {

        String str="A man, a plan, a canal: Panama";
        boolean result = isValidPalindrome(str);
        System.out.println("Result :: "+result);

        System.out.println(Character.getNumericValue('A'));
    }

    private static boolean isValidPalindrome(String str) {

        int i=0,j=str.length()-1;

        while(i<j) {

            while(i<j&& !Character.isLetterOrDigit(str.charAt(i))){i++;}
            while(i<j&& !Character.isLetterOrDigit(str.charAt(j))){j--;}
            if( Character.toLowerCase(str.charAt(i))!= Character.toLowerCase(str.charAt(j))) {
                return false;
            }

            i++;j--;
        }

        return true;
    }
}
