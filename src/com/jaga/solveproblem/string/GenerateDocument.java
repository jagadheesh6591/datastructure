package com.jaga.solveproblem.string;

import com.jaga.solveproblem.common.MyUtil;

import java.util.HashMap;

public class GenerateDocument {

    public static void main(String[] args) {

        String document = "hello wOrld";
        String characters = "helloworld ";

       // generateDocument(characters,document);
        boolean result = generateDocument1(characters, document);
        System.out.println("Result"+result);

    }

    private static boolean generateDocument1(String characters, String document) {

        for (int i = 0; i < document.length(); i++) {

            char c = document.charAt(i);
            int documentCount = countFreq(c,document);
            int charCount = countFreq(c,characters);

            if(documentCount>charCount) {
                return false;
            }

        }

        return true;
    }

    public static int countFreq(char c, String document) {

        long count = document.chars().filter(docChar -> c == docChar).count();
        return (int) count;
    }

    public static boolean generateDocument(String characters, String document) {

        int i=0,n=document.length();
        HashMap<Character,Integer> store = new HashMap<>();

        while(i<n) {
                if(store.get(document.charAt(i))!=null) {
                    store.put(document.charAt(i),store.get(document.charAt(i))+1);
                } else {
                    store.put(document.charAt(i),1);
                }


            i++;
        }

        int j=0,m=characters.length();
        HashMap<Character,Integer> storeC = new HashMap<>();

        while(j<m) {
                if(storeC.get(characters.charAt(j))!=null) {
                    storeC.put(characters.charAt(j),storeC.get(characters.charAt(j))+1);
                } else {
                    storeC.put(characters.charAt(j), 1);
                }

            j++;
        }

        if(storeC.isEmpty()) {
            return true;
        }

        if(storeC.size()>store.size()) {
            return false;
        }

        boolean b = storeC.entrySet().stream().allMatch(charMap -> store.get(charMap.getKey())!=null && charMap.getValue() >= store.get(charMap.getKey()));


        System.out.println("result "+b);

        System.out.println("Store");
        MyUtil.iterateMap(store);

        System.out.println("StoreC");
        MyUtil.iterateMap(storeC);

        return false;

    }
}
