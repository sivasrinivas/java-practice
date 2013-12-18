package com.sivasrinivas.arrays;


public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {6,3,9,5,7,4,5,0};
		a = insertionSort(a);
		for(int i=0; i<a.length; i++)
		System.out.print(a[i]+" ");
	}
	
	public static int[] insertionSort(int[] a){
		int key=0;
		key=0;
		
		for(int i=1; i<a.length; i++){
			key=a[i];
			int j=i-1;
			while(j>=0 && key<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
		return a;
	}
}
