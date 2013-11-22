package com.sivasrinivas.arrays;

public class AbsDistincts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {-4,2,2,2,3};
		System.out.println(solution(a));
	}

	public static int solution(int[] A) {
		int count = 0;
		for (int i = 0, j = A.length - 1; i <= j;) {
			
			while(i<A.length-1 && A[i]==A[i+1]){
				i++;
			}
			while(j>i && A[j]==A[j-1]){
				j--;
			}
			
			if (Math.abs(A[i]) == Math.abs(A[j])) {
				i++;
				j--;
			} else if (Math.abs(A[i]) > Math.abs(A[j])) {
				i++;
			} else {
				j--;
			}
			count++;
		}

		return count;
	}

}
