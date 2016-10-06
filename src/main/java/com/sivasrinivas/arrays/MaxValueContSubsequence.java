package com.sivasrinivas.arrays;


public class MaxValueContSubsequence {
	/**
	 * @author Siva
	 * @param args
	 */
	public static void main(String[] args){
		int array[] = {1,4,6,3,9,-3,-4,9};
		int length = array.length;
		int runSum, maxSum=0;
		int start=0,end=0,newStart=0;
		runSum=array[0];
		
		for(int i=1;i<length;i++){
			if(runSum+array[i]>array[i]){
				runSum+=array[i];
			}
			else{
				runSum=array[i];
				newStart=i;
			}
			if(runSum>maxSum){
				maxSum=runSum;
				start=newStart;
				end=i;
			}
		}
		System.out.println(maxSum+"-"+start+"-"+end);
	}
}
