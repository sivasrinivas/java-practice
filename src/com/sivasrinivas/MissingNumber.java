package com.sivasrinivas;

public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MissingNumber mn = new MissingNumber();
		System.out.println(mn.findMissing("1423456789"));
		
	}
	
	public String findMissing(String input){
		String finalString="";
		if(input==null)
			return finalString;
		int length = input.length();
		if(length==0 || length==1 || length==2)
			return input;
		if(length==3)
			return finalString;
		int prev = Integer.valueOf(input.substring(0, 2));
		for(int i=2; i<length; i=i+2){
			int curr = Integer.valueOf(input.substring(i, i+2));
			if(curr!=prev+1){
				int missing = prev+1;
				System.out.println("Missing is "+missing);
				input = input.substring(0, i)+missing+input.substring(i, length);
				return input;
			}
			prev=curr;
		}
		
		return finalString;
	}

}
