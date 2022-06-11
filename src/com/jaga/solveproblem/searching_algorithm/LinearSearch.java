package com.jaga.solveproblem.searching_algorithm;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {1,2,4,5,6,7,8,9};
		LinearSearch linearSearch = new LinearSearch();
		int result = linearSearch.doLinearSearch(a,8);
		System.out.println("Element found in the position "+(result+1));
	}

	private int doLinearSearch(int[] a, int d) {
		for(int i=0;i<a.length;i++){
			if(d==a[i]){
				return i;
			}
		}
		return -1;
	}
	
	//time complexity of the algorithm is O(n),it cost much
	
}
