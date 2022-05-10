package com.jaga.solveproblem.array;

public class RotateArray {
	
	public static void main(String[] args) {
		int a[] ={1,2,3,4,5,6,7,8};
		RotateArray rotateArray = new RotateArray();
		rotateArray.rotate(a,a.length,5);
		rotateArray.print(a);
	}

	private void rotate(int[] a, int length, int d) {
		for(int i=0;i<d;i++)
			doRotateByOne(a,length);
	}

	private void doRotateByOne(int[] a, int length) {
		for(int i=0;i<a.length-1;i++){
			int temp = a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}

	private void print(int[] array) {
		System.out.println("printing array => ");
		for(int a : array)
			System.out.print(a+" ");
		System.out.println();
	}
}
