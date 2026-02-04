package com.jaga.solveproblem.neetcode150.slidingwindow;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
       String s = "ABAB";
       int k = 2;

       int result = characterReplacement(s,k);
       System.out.println(result);
    }

    public static int characterReplacement(String s, int k) {
        int maxLength=0;
        int[] count = new int[26];
        int maxFrequency=0, left=0;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'A']++;
            maxFrequency = Math.max(maxFrequency, count[s.charAt(i)-'A']);
            while ((i-left +1)-maxFrequency > k ){
                count[s.charAt(left)-'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,i-left +1 );
        }

        return maxLength;
    }
}
