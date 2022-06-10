package com.jaga.solveproblem.string;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String str = "jaga is on fire";
        System.out.println(str.length());
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

        int maxDiv10 = Integer.MAX_VALUE / 10;
        System.out.println(maxDiv10);

        System.out.println(sb.toString());

    }
}
