package com.jaga.solveproblem.string;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWildCardsWithZerosAndOnes {

	public static void main(String[] args) {
		String givenStr = "0?1?";
		List<String> returnList = new ArrayList<>();
		long count = getWildCardCount(givenStr);
		System.out.println("length count : "+count);
		
		
		
		/*for(int i=0;i<givenStr.length();i++) {
			if(givenStr.charAt(i)=='?') {
				boolean flag = getWildCardCount(givenStr.substring(i+1))==0;
				if(flag) {
					char[] charArray = givenStr.toCharArray();
					charArray[i]='0';
					returnList.add(String.valueOf(charArray));
					charArray[i]='1';
					returnList.add(String.valueOf(charArray));
				} else {
					
				}
				
			}
		}*/
		
		System.out.println("Result "+returnList);
		
				
	}
	
	private static String getWildCardString(String str){
		
		return null;
	}

	private static long getWildCardCount(String givenStr) {
		//long count = givenStr.chars().filter(ch -> ch == '?').count();
		long count = givenStr.length()-givenStr.replace("?","").length();
		return count;
	}
	
	private static boolean isWildCardPresent(String givenStr) {
		return getWildCardCount(givenStr)>0L;
	}
	
	
}
