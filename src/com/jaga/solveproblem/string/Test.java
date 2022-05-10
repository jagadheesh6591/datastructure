package com.jaga.solveproblem.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args)  {
        String password = "$jagadeesh";
        //System.out.println(password.matches("^[a-zA-Z]{1,10}$"));
        System.out.println(password.matches("^(?=.*[@#$%^&+=]).*$"));


        String s = "{{}}";

        Integer occurrence = s.length()-s.replace("{","").length();

        Integer occurrence1 = s.length()-s.replace("}","").length();


        System.out.println(occurrence);


    }
}
