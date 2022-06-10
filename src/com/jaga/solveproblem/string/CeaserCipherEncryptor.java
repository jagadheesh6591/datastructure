package com.jaga.solveproblem.string;

public class CeaserCipherEncryptor {

    public static void main(String[] args) {

        String str = "abc";
        int k=2;

        StringBuilder res = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {

            int charVal = (int) str.charAt(i) + k%26;

            if(charVal > (int) 'z') {
                charVal = charVal%(int) 'z' +  ((int) 'a' - 1);
            }

            res.append((char)charVal);

        }

        System.out.println(res.toString());

    }
}
