package com.jaga.solveproblem.ds.sortingalgorithms;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int i =0;
		int j = --i;
		System.out.println(i++ + --i + i-- + j-- + --i + i);
		
		int x=99,y=100;
		System.out.println((x*y)/(x=y));
		
		int n=1001,copy=0,local;
		local=n;
		while(local!=0){
			copy = copy*10;
			copy = copy + local % 10;
			local = local/10;
			
		}
		
		System.out.println(copy);
	}

}
