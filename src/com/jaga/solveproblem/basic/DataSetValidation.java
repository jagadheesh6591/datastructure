package com.jaga.solveproblem.basic;

import java.util.HashMap;

public class DataSetValidation {
    public static void main(String[] args) {

        String[] str = {"2008,Maranhao,Agosto,713","2008,Santa Catarina,Dezembro,29","2008,Rio,Fevereiro,25","2008,767"};
        HashMap<Integer,Integer> dataset = new HashMap<>();
        for(String s : str) {
            System.out.println(s);
            String data[] = s.split(",");
            if(data.length>2) {
                System.out.println(s);
                Integer year = Integer.valueOf(data[0]);
                Integer number= Integer.valueOf(data[3]);

                if(dataset.get(year)!=null) {
                    dataset.put(year,dataset.get(year)+number);
                } else {
                    dataset.put(year,number);
                }

            } else {

                System.out.println(s);
                System.out.println(dataset.get(Integer.valueOf(data[0])));
                System.out.println(data[1]);

                if(dataset.get(Integer.valueOf(data[0])).equals(Integer.valueOf(data[1]))) {
                    System.out.println(dataset.get(Integer.valueOf(data[0])).equals(Integer.valueOf(data[1]))
                    );
                }
            }
        }


    }

}
