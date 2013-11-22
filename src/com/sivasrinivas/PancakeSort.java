package com.sivasrinivas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PancakeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {4,8,-1,9,3,6,7};
//		System.out.println(Arrays.toString(a));
//		sort(a);
//		System.out.println(Arrays.toString(a));
		
		System.out.println("5460".compareTo("6054"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	
	/*
	 * 1. from n-1 to 1 (0th element automatically in right place)
	 * 2. find max from o to i (n-1 to 1)
	 * 3. reverse 0, max (max will be at 0th postion)
	 * 4. reverse 0, i (now max at 0th place will be placed at end)
	 */ 
	public static void sort(int[] a){
		int l = a.length;
		for (int i=l-1;i>0 ;i-- ) {
			int max = findMax(a, i);

			if(max!=i){
				reverse(a, max);
				reverse(a,i);
			}
		}

	}

	public static void reverse(int[] a, int i){
		int start=0;
		int end=i;
		if(start>end)
			return;
		while(start<end){
			int temp = a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}

	public static int findMax(int[] a, int end){
		int max=0;
		for(int i=0; i<=end;i++){
			if (a[i]>a[max]) {
				max=i;
			}
		}
		return max;
	}

}
