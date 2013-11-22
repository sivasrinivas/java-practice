package com.sivasrinivas;

public class IncreasingSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {4,-1,-2,-3,90};
		IncreasingSequence is = new IncreasingSequence();
		is.incSeq(a);
	}
	
	public void incSeq(int[] a){
		if(a.length<1)
			return;
		int start=0, end=0, newStart=0;
		int count =1, prevCount=1;
		for(int i=1;i<a.length;i++){
			if(a[i]>=a[i-1]){
				count++;
			}
			else{
				count=1;
				newStart=i;
			}
			if(count>prevCount){
				prevCount=count;
				start=newStart;
				end=i;
			}
			
		}
		
		System.out.println("start "+a[start]);
		System.out.println("end is "+a[end]);
	}

}
