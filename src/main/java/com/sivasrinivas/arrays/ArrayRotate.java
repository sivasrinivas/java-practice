package com.sivasrinivas.arrays;


public class ArrayRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char array[] = {'a','b','c','d','e','f'};
		int l = array.length;
		int n = 2;
		
		//copy last n chars to temp array in reverse
		char temp[] = new char[n];
		for(int i=0; i<n; i++){
			temp[i] = array[l-i-1];
		}
		
		//shift chars by n positions
		for(int i=l-n-1; i>=0; i--){
			array[i+n] = array[i];
		}
		
		//copy temp array chars to array
		for(int i=0; i<n; i++){
			array[n-1-i] = temp[i];
		}
		
		for(int i=0; i<array.length; i++)
		System.out.print(array[i]);
	}

}
