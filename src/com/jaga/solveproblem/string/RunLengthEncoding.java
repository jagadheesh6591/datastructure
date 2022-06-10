package com.jaga.solveproblem.string;

public class RunLengthEncoding {

    public static void main(String[] args) {

        String string = "AAAAAAAAAAAAABBCCCCDD";
        StringBuilder sb = new StringBuilder(string.length());
        //int i=0;
        int count=1;

        for (int i = 1; i < string.length(); i++) {
            if(string.charAt(i-1)!=string.charAt(i) || count==9) {
                sb.append(count).append(string.charAt(i-1));
                count=0;
            }
            count+=1;
        }
        sb.append(count).append(string.charAt(string.length()-1));


        System.out.println(sb.toString());
    }
}
