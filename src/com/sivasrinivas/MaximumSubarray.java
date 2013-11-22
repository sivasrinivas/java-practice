package com.sivasrinivas;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] a = {-1,-2,90,-3,8};
		System.out.println(maxSum(a));
	}

	public static int maxSum(int[] a){
		if(a==null)
			return 0;
		int length = a.length;
		if(length==0)
			return 0;
		if(length==1)
			return a[0];
		int start=0, newStart=0, end=0;
		int sum=0, maxSum=Integer.MIN_VALUE;

		for(int i=0; i<length; i++){
			if(sum+a[i]>a[i]){
				sum=sum+a[i];
			}else{
				sum=a[i];
				newStart=i;
			}
			if(sum>maxSum){
				maxSum=sum;
				start=newStart;
				end=i;
			}
			
		}

		return maxSum;
	}


}	