/**
 * 
 */
package com.sivasrinivas.strings;

import java.util.HashMap;

/**
 * @author Siva
 *
 */
public class MaxSubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(maxSubstring("sivas"));

	}
	
	public static int maxSubstring(String input){
		if(input==null || input.length()==0)
			return 0;
		char[] ch=input.toCharArray();

		int window=0, start=0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<ch.length; i++){
			if(map.containsKey(ch[i])){
				int current = i- start;
				if(window<current){
					window=current;
				}
				start=map.get(ch[i])+1;
			}
			if(i==ch.length-1){
				int current=i-start+1;
				if(window<current){
					window=current;
				}
				return window;
			}

			map.put(ch[i], i);
		}
		return 0;
	}
	
	public static int find(String source){
		int window = 0;
		int start = 0;
		int i =0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		while( i < source.length()){
			if(map.containsKey(source.charAt(i))){	
				int currentWindow = i-start;
				if(window < currentWindow){
					window = currentWindow;
				}
				start = map.get(source.charAt(i)) + 1;
				//map.clear();
			}
			if(i+1 == source.length()){
				int currentWindow = i-start +1;
				if(window < currentWindow){
					window = currentWindow;
				}
				return window;
			}
			map.put(source.charAt(i), i);
			i++;
		}	
		return 0;
	}

}
