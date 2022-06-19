package com.jaga.solveproblem.string;

public class LongestBalancedSubString {

    public static void main(String[] args) {

        String string="())()(()())";


        int result=0;
        int openCount=0;
        int closeCount=0;

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='(') {
                openCount++;
            } else if(string.charAt(i)==')') {
                closeCount++;
            }

            if(openCount==closeCount) {
                result=Math.max(result,closeCount*2);
            }

            if(closeCount>openCount) {
                openCount=0;
                closeCount=0;
            }
        }

        openCount=0;
        closeCount=0;

        for (int i = string.length()-1; i >=0 ; i--) {
            if(string.charAt(i)==')') {
                openCount++;
            } else if(string.charAt(i)=='(') {
                closeCount++;
            }

            if(openCount==closeCount) {
               result= Math.max(result,closeCount*2);
            }

            if(closeCount>openCount) {
                openCount=0;
                closeCount=0;
            }
        }

        System.out.println(result);
    }



        public static int balancedSubStringCheck(String string, int leftIdx, int rightIdx) {

            int count=0;
            while(leftIdx>=0&&rightIdx< string.length()) {
                if( string.charAt(leftIdx)!='(' || string.charAt(rightIdx)!=')' ) {
                    break;
                }

                count+=2;
                leftIdx--;
                rightIdx++;

            }
            return count;
        }
}
