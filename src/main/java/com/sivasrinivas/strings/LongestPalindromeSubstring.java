package com.sivasrinivas.strings;

public class LongestPalindromeSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(longestPalindrome("lirilssliril"));
//		System.out.println("siva".substring(2,1));
	}
	
	public static String longestPalindrome(String s){
		if(s==null || s.length()==0)
			return s;
		int max=0;
		String maxString=s.substring(0,1);
		for(int i=0; i<s.length(); i++){
			String p1 = expandAroundCenter(s, i, i);
			if(p1.length()>=max){
				max=p1.length();
				maxString = p1;
			}
			String p2 = expandAroundCenter(s,i,i+1);
			if(p2.length()>=max){
				max=p2.length();
				maxString = p2;
			}
		}
		
		return maxString;
	}

	public static String expandAroundCenter(String s, int l, int r){
		if(s==null || s.length()==0)
			return s;
		while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
			l--;
			r++;
		}
		return s.substring(l+1, r);
	}
}
