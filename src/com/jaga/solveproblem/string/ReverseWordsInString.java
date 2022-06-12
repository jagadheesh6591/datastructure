package com.jaga.solveproblem.string;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String str = "jaga is    on fire";
        System.out.println(str.length());
        System.out.println("reversed String "+reverseWordsInString(str));

        StringBuilder sb = new StringBuilder();

        int j= str.length();
        for(int i=str.length()-1;i>=0;i--) {

            if(str.charAt(i)==' ') {
                j=i;
            } else if( i==0 || str.charAt(i-1)==' ') {

                if (sb.length() != 0) {
                    sb.append(' ');
                }
                sb.append(str.substring(i,j));
            }

        }

        //System.out.println(sb.toString());

    }

    public static String reverseWordsInString(String string) {
        // Reverse String and retain space.
        StringBuilder sb = new StringBuilder(string.length());
        int endIdx=string.length();
        for (int i = string.length()-1; i >=0 ; i--) {

            if(string.charAt(i)==' ') {
                sb.append(" ");
                endIdx=i;
            } else if(i==0 || string.charAt(i-1)==' ') {
                sb.append(string.substring(i,endIdx));
                endIdx=i;
            }

        }

        return sb.toString();
    }
}
