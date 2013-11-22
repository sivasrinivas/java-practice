package com.sivasrinivas;

public class RunLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(runLength("wwwwaaadexxxxxxy"));
	}
	
	public static String runLength(String input){
		if(input==null || input.length()==0)
			return input;
		StringBuilder sb = new StringBuilder();
		char[] ch = input.toCharArray();
		char prev = ch[0];
		int count = 1;
		for(int i=1; i<ch.length; i++){
			if(ch[i]==prev)
				count++;
			else{
				sb.append(""+prev+count);
				count=1;
				prev=ch[i];
			}
		}
		sb.append(""+prev+count);
		
		return sb.toString();
	}

}
