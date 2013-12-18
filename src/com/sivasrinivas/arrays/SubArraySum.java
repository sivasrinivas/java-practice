package com.sivasrinivas.arrays;

public class SubArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {10, 5};
		subarray(a, 7);
	}
	
	public static void subarray(int[] a, int sum){
		int cur = 0;
		int start = 0;
		for(int i=0; i<a.length; i++){
			cur=cur+a[i];
			while(cur>sum){
				cur=cur-a[start];
				start++;
			}
			if(cur==sum){
				System.out.println(start+","+i);
			}
		}
	}

}
