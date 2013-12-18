package com.sivasrinivas.strings;

public class KMP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubstring("sivass", "siva"));
	}
	
	public static boolean isSubstring(String input, String pattern){
		if(input==null || pattern==null)
			return false;
		if(input.length()<pattern.length())
			return false;
		int[] lps = calculateLPS(pattern);
		int i=0, j=0;
		while(i<input.length()){
			if(input.charAt(i)==pattern.charAt(j)){
				i++; j++;
				if(j==pattern.length())
					return true;
				
			}else{
				if(j==0){
					i++;
				}else{
					j=lps[j-1];
				}
			}
		}
		
		return false;
	}
	
	public static int[] calculateLPS(String pattern){
		if(pattern == null || pattern.length()==0)
			return new int[0];
		int[] lps = new int[pattern.length()];
		
		int length = 0;
		int i=1;
		lps[0]=0;
		while(i<pattern.length()){
			if(pattern.charAt(i)==pattern.charAt(lps[length])){
				length++;
				lps[i]=length;
				i++;
			}else{
				if(length!=0){
					length=lps[length-1];
				}else{
					lps[i]=0;
					i++;
				}
			}
		}
		
		return lps;
	}

}
