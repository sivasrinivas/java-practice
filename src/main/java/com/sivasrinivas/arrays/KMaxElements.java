package com.sivasrinivas.arrays;

import java.util.PriorityQueue;

public class KMaxElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stream[] = {9,4,6,1,0,3,2,8,5,7};
		printKMaxElements(stream, 4);
	}
	
	public static void printKMaxElements(int[] stream, int k){
		//validations
		if(k<=0 || stream==null || stream.length==0)
			return;
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i=0; i<stream.length; i++){
			if(q.size()<k){
				q.offer(stream[i]);
			}else{
				if(q.peek()<stream[i]){
					q.poll();
					q.add(stream[i]);
				}
			}
		}
		while(!q.isEmpty())
		System.out.print(q.poll()+" ");
	}

}
