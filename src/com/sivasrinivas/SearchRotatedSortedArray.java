package com.sivasrinivas;

public class SearchRotatedSortedArray {
	
	public static void main(String[] args){
		int a[] = {7,8,9,1,3,4};
		
		SearchRotatedSortedArray test = new SearchRotatedSortedArray();
		System.out.println(test.find(a, 2));
	}
	
	public boolean find(int[] a, int k){
		int l = 0;
		int r = a.length-1;
		while(l<=r){
			int m=(l+r)/2;
			if(a[m]==k)
				return true;
			
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
		return false;
	}
}
