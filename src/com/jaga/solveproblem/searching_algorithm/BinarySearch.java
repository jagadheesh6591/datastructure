package com.jaga.solveproblem.searching_algorithm;

public class BinarySearch {

	/* https://leetcode.com/problems/binary-search/ */
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int a[]={5,9,11,16,19,23,38,56,72,98};
		int n = a.length;
		//int result = binarySearch.doBinarySearch(a, 23, 0, n - 1);
		int target = 72;
		print(a);
		int left = 0;
		int right = a.length-1;
		int result = -1;

		while(left < right) {

			int middle = (left + right) / 2;

			if(a[middle] == target) {
				result = middle;
				break;
			} else if(a[middle] > target) {
				right = middle-1;
			} else {
				left = middle+1;
			}

		}

		System.out.println("The result is === > ");
		System.out.println(result);
	}



	private int doBinarySearch(int[] a, int d,int l, int r) {
		print(a);
		if(l<r){
			int mid =  (r+l)/2;
			System.out.println("Enter middle element "+ a[mid]);

			if(a[mid]==d) {
				return mid;
			}
			if(d>a[mid]) {
				return doBinarySearch(a, d, mid+1, r);
			} else {
				return doBinarySearch(a, d, 0, mid);
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
