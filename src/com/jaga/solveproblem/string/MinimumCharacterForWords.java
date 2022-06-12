package com.jaga.solveproblem.string;

import com.jaga.solveproblem.common.MyUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumCharacterForWords {

    public static void main(String[] args) {

        String[] input= {"this", "that", "did", "deed", "them!", "a"};
        HashMap<Character,Integer> globalStore = new HashMap<>();
        for(String str:input) {

            Map<Character,Integer> localStore = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {

                if(localStore.get(str.charAt(i))==null) {
                    localStore.put(str.charAt(i),1);
                } else {
                    localStore.put(str.charAt(i),localStore.get(str.charAt(i))+1);
                }

            }

           localStore.forEach((k,v)->{
               if(globalStore.get(k)==null){
                   globalStore.put(k,v);
               } else if(globalStore.get(k)<localStore.get(k)) {
                   globalStore.put(k,v);
               }
           });
        }

        ArrayList<Character> characterList = new ArrayList<>();
        globalStore.forEach((k,v)->{
            while(v>0) {
                characterList.add(k);
                v--;
            }
        });

        Character[] array = new Character[characterList.size()];

        for (int i = 0; i < characterList.size(); i++) {
            array[i]=characterList.get(i);
        }

    }
}
