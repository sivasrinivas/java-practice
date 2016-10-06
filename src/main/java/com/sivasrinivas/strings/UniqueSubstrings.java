package com.sivasrinivas.strings;

import java.util.Arrays;
/**
 * Find unique substrings of a given string
 * Solution: here the logic, if you find all prefixes of suffixes of the given string, you have covered all possible substrings.
 * So find all suffixes of given string, then sort them for easy elimination of  duplicate substrings formed by those suffixes.
 * No compare pairs of suffixes for longest common prefix and then subtract it from suffix length, to get unique substrings form by that
 * http://www.careercup.com/question?id=3315662 
 * @author Siva
 *
 */

public class UniqueSubstrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getUniqueSubstringCount("banana"));
	}
	
	public static int getUniqueSubstringCount(String input){
		if(input==null)
			return 0;
		int length = input.length();
		if(length ==0)
			return 0;
		String suf[] = new String[length];
		for(int i=0; i<length; i++){
			suf[i]=input.substring(i, length);
		}
		Arrays.sort(suf);
		int count = suf[0].length();
		for(int i=1; i<length; i++){
			int p = lcp(suf[i-1], suf[i]);
			//subtract that lcp to eliminate duplicate substrings
			count += suf[i].length()-p;
		}
		
		return count;
	}
	
	public static int lcp(String in1, String in2){
		int count = 0;
		for(int i=0; i<Math.min(in1.length(), in2.length()); i++){
			if(in1.charAt(i)==in2.charAt(i))
				count++;
			else
				break;
		}
		return count;
	}

}
