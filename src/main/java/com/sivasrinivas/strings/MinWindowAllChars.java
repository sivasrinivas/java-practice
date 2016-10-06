package com.sivasrinivas.strings;

public class MinWindowAllChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(minWindow("acbbaca", "aba"));
	}
	
	public static boolean minWindow(String s, String t){
		int tLen = t.length();
		int sLen = s.length();
		int count=0;
		int minWindow = Integer.MAX_VALUE;
		int[] needToFind = new int[256];
		int[] hasFound = new int[256];
		//initialize needToFind with t string chars
		for(int i=0; i<tLen; i++){
			needToFind[t.charAt(i)]++;
		}
		
		for(int begin=0,end=0; end<sLen; end++){
			char endChar = s.charAt(end);
			if(needToFind[endChar]==0)
				continue;
			hasFound[endChar]++;
			if(hasFound[endChar]<=needToFind[endChar])
				count++;
			//if required window found
			if(count==tLen){
				//try to reduce min window without breaking condition 
				while(needToFind[s.charAt(begin)]==0 || hasFound[s.charAt(begin)]>needToFind[s.charAt(begin)]){
					if(hasFound[s.charAt(begin)]>needToFind[s.charAt(begin)])
						hasFound[s.charAt(begin)]--;
					begin++;
				}
				
				int window = end-begin+1;
				if(window<minWindow){
					minWindow=window;
					System.out.println("Min window length: "+minWindow);
					System.out.println("Current min window: "+begin+" to "+end);
				}
			}
		}
		if(count==tLen)	return true;
		return false;
	}

}
