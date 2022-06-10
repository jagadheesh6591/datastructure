package com.jaga.solveproblem.string;

public class StringSubstr {

    public static void main(String[] args) {

        /*TODO fix it*/
        int result = new StringSubstr().strStr("mississippi", "issip");
        System.out.println(result);

    }

    public int strStr(String haystack, String needle) {

        if(needle!=null && needle.isEmpty()) {
            return 0;
        }

        if(haystack!=null && haystack.isEmpty()) {
            return -1;
        }

        if(needle.length()>haystack.length()) {
            return -1;
        }

        int i=0,j=haystack.length()-1;
        int startIndex=-1;
        while (i<haystack.length()) {

            if(haystack.charAt(i)==needle.charAt(0)){
                startIndex=i;
                break;
            }

            i++;
        }

        if(startIndex==-1 || needle.length() > haystack.length()-startIndex) {
            return -1;
        }

       int k=startIndex, l=0;

        while(k<haystack.length() && l<needle.length()) {

            if(haystack.charAt(k)!=needle.charAt(l)) {
                return -1;
            }

            k++;l++;
        }

        return startIndex;

    }
}
