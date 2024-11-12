package com.jaga.solveproblem.string;

public class BackSpaceString {

    public static void main(String[] args) {

        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }

    public static boolean backspaceCompare(String s, String t) {

        int i=s.length()-1,j=t.length()-1;

        while(i>=0 || j>=0) {
            i= getNextValidChars(s,i);
            j= getNextValidChars(t,j);

            if(i<0&&j<0)
                return true;

            if(i<0||j<0||s.charAt(i)!=t.charAt(j)){
                return false;
            }
            i--;
            j--;
        }

        return true;
    }

    private static int getNextValidChars(String string, int index) {

        int skip=0;
        while(index>=0) {
            if(string.charAt(index)=='#') {
                skip++;
            } else if (skip>0) {
                skip--;
            } else {
                break;
            }
            index--;
        }
       return index;
    }
}
