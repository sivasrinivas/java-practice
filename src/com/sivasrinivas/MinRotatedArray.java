package com.sivasrinivas;

public class MinRotatedArray 
{
	public static void main(String[] args) 
	{
		int[] a = {5, 6, 1, 2, 3, 4};
		System.out.println(getMin(a));
	}


	public static int getMin(int[] a){
		int l=0, r=a.length-1;

		int min=Integer.MAX_VALUE;
		int curMin=0;
		
		while(l<r){
			
			int m=(l+r)/2;
			if(a[l]<a[m]){
				curMin=a[l];
				l=m+1;
			}else {
				curMin=a[m];
				r=m-1;
			}
			
			if(curMin<min)
				min=curMin;
		}
		return min;
	}
}
