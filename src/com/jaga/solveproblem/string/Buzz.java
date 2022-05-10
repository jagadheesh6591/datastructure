package com.jaga.solveproblem.string;

public class Buzz {

	public static void main(String[] args) {
		String str1 = "aravind";
		String str2 = "jaga";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("======================");

		str1 = str1.concat(str2);
		System.out.println("str1 : "+str1);
		System.out.println(str1.length()-str2.length());
		
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
	}
}
