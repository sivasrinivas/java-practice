package com.sivasrinivas.strings;

import java.util.HashMap;

/**
 * Find the first non-repeating character in a stream of characters?
 * you can read stream only one time
 * @author Siva
 *
 */
public class NonRepeatingCharacterInStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(nonRepeatingCharacter(""));
	}
	
	public static char nonRepeatingCharacter(String input){
		if(input==null || input.length()==0)
			return ' ';
		Integer minus = -1;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<input.length(); i++){
			char ch = input.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch, minus);
			}else{
				map.put(ch, i);
			}
		}
		
		int min=Integer.MAX_VALUE;
		
		for(Character key:map.keySet()){
			Integer value = map.get(key);
			if(value!=minus){
				if(value<min)
					min=value;
			}
		}
		
		return input.charAt(min);
		
	}

}
