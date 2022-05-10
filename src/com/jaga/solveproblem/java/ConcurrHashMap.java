package com.jaga.solveproblem.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrHashMap {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> concurrHashMap = new ConcurrentHashMap<>();
        concurrHashMap.put(1,"one");
        concurrHashMap.put(2,"two");
        concurrHashMap.put(3,"three");
        //concurrHashMap.put(null,""); Null Pointer Exception

        concurrHashMap.entrySet().iterator();
        //ConcurrentHashMap returns Iterator, which fails-safe  on concurrent modification.
        // (i.e. iterator will make a copy of the internal data structure)

        concurrHashMap.entrySet().forEach(e-> {
            System.out.println(e.getKey() + " : "+e.getValue());
            if(e.getKey().equals(3)) {
                concurrHashMap.remove(3);
            }
        });

        show(concurrHashMap);

        HashMap<Integer,String> hasmap = new HashMap<>();
        hasmap.put(1,"one");
        hasmap.put(2,"two");
        hasmap.put(3,"three");
        hasmap.put(null,"");

        Iterator<Map.Entry<Integer, String>> it = hasmap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " : "+entry.getValue());
            if(entry.getKey().equals(3)) {
                it.remove();
            }
        }


        /*hasmap.entrySet().forEach(e-> {
            System.out.println(e.getKey() + " : "+e.getValue());
            if(e.getKey().equals(3)) {
                hasmap.remove(3);
            }
        });*/

        show(hasmap);
    }

    private static void show(Map<Integer, String> concurrHashMap) {

        concurrHashMap.entrySet().forEach(e->{
            System.out.println(e.getKey() + " "+ e.getValue());
        });
    }


}
