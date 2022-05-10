package com.jaga.solveproblem.ds.searching_algorithm;

public class BinarySearch {
	
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int a[]={5,9,11,16,19,23,38,56,72,98};
		int n = a.length;
		binarySearch.doBinarySearch(a,23,0,n-1);
		System.out.println(a.length);
	}

	private int doBinarySearch(int[] a, int d,int l, int r) {
		print(a);
		if(r>=l){
			int mid = 1 + (r-l)/2;
			System.out.println("Enter middle element "+mid);
			if(d>a[mid]) {
				doBinarySearch(a, d, mid+1, r);
			} else {
				doBinarySearch(a, d, 0, mid);
			}
		}
		return -1;
	}
	
	private static void print(int[] array) {
		System.out.println("printing array => ");
		for(int a : array)
			System.out.print(a+" ");
		System.out.println();
	}

	
}
