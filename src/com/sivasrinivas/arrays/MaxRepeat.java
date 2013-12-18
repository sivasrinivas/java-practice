package com.sivasrinivas.arrays;

import java.util.HashMap;


public class MaxRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {-1,-1,-1};
		System.out.println(printMaxRep(array));
	}
	public static int printMaxRep(int[] array){
		if(array.length==0){
			System.out.println("empty array.");
			return -1;
		}
		int max=-1;
		int maxRep = -1;
		Integer freq=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++){
			freq = map.get(array[i]);
			if(freq!=null){
				freq=freq+1;
			}
			else{
				freq=1;
			}
			map.put(array[i], freq);
			if(freq>=max){
				max=freq;
				maxRep = array[i];
			}
		}
		System.out.println(max);
		return maxRep;
	}

}
