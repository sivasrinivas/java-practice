package com.sivasrinivas.arrays;

import java.util.HashMap;

public class PairSumN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {4,5,4,5};
		printPairs(a, 9);
	}
	
	public static void printPairs(int[] a, int n){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++){
			int diff = n-a[i];
			if(map.containsKey(diff)){
				System.out.println("("+a[i]+","+diff+")");
				if(map.get(diff)==1)
					map.remove(diff);
				else
					map.put(diff, map.get(diff)-1);
			}else{
				if(map.containsKey(a[i])){
					map.put(a[i], map.get(a[i])+1);
				}else
					map.put(a[i], 1);
			}
				
		}
	}

}
