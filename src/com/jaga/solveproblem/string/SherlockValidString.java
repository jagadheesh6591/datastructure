package com.jaga.solveproblem.string;

import com.jaga.solveproblem.common.MyUtil;

import java.util.*;
import java.util.stream.Collectors;

public class SherlockValidString {

    public static void main(String[] args) {
        boolean isValid = false;
        //String s = "aabbccddeefghi";
        String s = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
        String result = isValidString(s);


        System.out.println(result);

    }

    private static String isValidString(String s) {
        String returnVal = "NO";

        Map<Character, Integer> valuesFromString = getValuesFromString(s);
        HashSet<Integer> set = new HashSet<Integer>(valuesFromString.values());

        if(set.size()==1) {
            returnVal= "YES";
        } else if(set.size()>2) {
            returnVal = "NO";
        } else {
            List<Integer> setVals = new HashSet<Integer>(valuesFromString.values()).stream().collect(Collectors.toList());

            int occurance1=0;
            int occurance2=0;
            int el1=setVals.get(0);
            int el2=setVals.get(1);

            for(Integer i : valuesFromString.values()) {
                if(el1==i) {
                    occurance1= occurance1+ 1;
                } else if(el2==i){
                    occurance2= occurance2 +1;
                }
            }

            if( ( occurance1==1&&el1==1)  || (occurance2==1&&el2==1)){
                returnVal= "YES";
            } else if(Math.abs(el1 - el2)  == 1 && (occurance1==1 || occurance2==1)) {
                returnVal= "YES";
            }

        }


        return returnVal;
    }

    static Map<Character, Integer> getValuesFromString(String str) {

      Map<Character,Integer> charCounts = new HashMap<>();
      for(Character c : str.toCharArray()) {
          if(charCounts.get(c)==null)
              charCounts.put(c,1);
          else
              charCounts.put(c,charCounts.get(c)+1);

      }

        MyUtil.iterateMap(charCounts);
        return charCounts;
        //return new HashSet<>(charCounts.values());
    }
}
