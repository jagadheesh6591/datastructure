package com.jaga.solveproblem.string;

public class ValidPalindrom {

    public static void main(String[] args) {

        String str="A man, a plan, a canal: Panama";
        boolean result = isValidPalindrome(str);
        System.out.println("Result :: "+result);
    }

    private static boolean isValidPalindrome(String str) {

        str = str.toLowerCase();
        int i=0,j=str.length()-1;

        while(i<j) {

            while(i<j&& !Character.isLetterOrDigit(str.charAt(i))){i++;}
            while(i<j&& !Character.isLetterOrDigit(str.charAt(j))){j--;}
            if( str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean isValidPalindrom(String str) {
        int i=0,j=str.length()-1;

        while(i<j) {
            if( Character.toLowerCase(str.charAt(i))!= Character.toLowerCase(str.charAt(j))) {
                return false;
            }

            i++;j--;
        }

        return true;

    }



}
