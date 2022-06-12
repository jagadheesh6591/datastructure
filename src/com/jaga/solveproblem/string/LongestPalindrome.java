package com.jaga.solveproblem.string;

public class LongestPalindrome {

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        String str="abcxyzzyxf";
        String longestSubStringPalindrome=str.substring(0,1);
        for (int i = 1; i < str.length(); i++) {

            String oddPal = checkPalindromInGivenIndex(str,i-1,i+1);
            String evenPal = checkPalindromInGivenIndex(str,i-1,i);
            String maxPal = oddPal.length()>evenPal.length()?oddPal:evenPal;

            if(maxPal.length()>longestSubStringPalindrome.length()) {
                longestSubStringPalindrome = maxPal;
            }


        }

        System.out.println(longestSubStringPalindrome);

    }

    public static String checkPalindromInGivenIndex(String str, int leftIdx, int rightIdx) {

        while(leftIdx>=0&&rightIdx<str.length()) {

            if(str.charAt(leftIdx)!=str.charAt(rightIdx)) {
                break;
            }

            leftIdx--;
            rightIdx++;
        }

        return str.substring(leftIdx+1,rightIdx);
    }
}
