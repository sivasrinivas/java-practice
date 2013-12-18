package com.sivasrinivas.arrays;

public class SearchRotatedSortedArray {
	
	public static void main(String[] args){
		int a[] = {7,8,9,1,3,4};
		
		System.out.println(find(a, 2));
	}
	
	public static int find(int[] a, int k){
		if(a==null || a.length==0)
			return -1;
		int l = 0;
		int r = a.length-1;
		while(l<=r){
			int m=(l+r)/2;
			if(a[m]==k)
				return m;
			
			if(a[l]<=a[m]){ //first half of the array is sorted
				if(a[l]<=k && k<a[m])
					r=m-1;
				else
					l=m+1;
			}
			else{
				if(a[m]<k && k<=a[r])
					l=m+1;
				else
					r=m-1;
			}
		}
		return -1;
	}
}
