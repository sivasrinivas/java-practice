package com.sivasrinivas.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = {1,2,4};//,4,3,4,4,5,5,3,7,5};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int store=0;
		for(int i=1; i<a.length; i++){
			if(a[store]!=a[i]){
				store++;
				a[store]=a[i];
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, store+1)));
	}

}
