package com.sivasrinivas.strings;

import java.util.Arrays;

public class SplitByDelim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "sivasrinivas";
		int start=0;
		char delim = 's';
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==delim){
				System.out.println(s.substring(start,i));
				start=i+1;
			}
		}
		if(s.charAt(s.length()-1)!=delim){
			System.out.println(s.substring(start, s.length()));
		}
		
		System.out.println(Arrays.toString(s.split("s")));
	}

}
