package com.jaga.solveproblem.basic;

public class Palindrom {
	
	public static void main(String[] args) {
		
		int n = 123;
		int temp=n,sum=0;
		
		while(n>0) {
			sum = sum*10 + n%10;
			n=n/10;
		}
		System.out.println(sum);
		
		
	}

}
