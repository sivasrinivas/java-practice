package com.sivasrinivas.arrays;

import java.util.Scanner;

class SelectionSort {
	public static void main(String[] args) {
		int n, c, d, swap;
		Scanner in = new Scanner(System.in);

		// System.out.println("Input number of integers to sort");
		// n = in.nextInt();
		//
		// int array[] = new int[n];
		//
		// System.out.println("Enter " + n + " integers");
		//
		// for (c = 0; c < n; c++)
		// array[c] = in.nextInt();

		int[] array = { 6, 3, 9, 5, 7, 4, 5, 0 };

		for (int i = 0; i < array.length; i++) {
			int min = i;
			int minVal = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (minVal > array[j]) {
					minVal = array[j];
					min = j;
				}

			}
			if (i != min) /* For descending order use < */
			{
				swap = array[i];
				array[i] = array[min];
				array[min] = swap;
			}
		}

		System.out.println("Sorted list of numbers");

		for (c = 0; c < array.length; c++)
			System.out.println(array[c]);
	}
}