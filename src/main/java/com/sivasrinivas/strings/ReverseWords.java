package com.sivasrinivas.strings;

public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(reverse("test siva"));
		
	}
	
	public static String reverse(String input){
		//invalid cases
		if(input==null || input.length()==0 || input.length()==1)
			return input;
		
		int length = input.length();
		char[] ch = input.toCharArray();
		revChars(ch, 0, length-1);
		
		
		for(int i=0, start=0; i<length; i++){
			if(ch[i]==' '){
				if(ch[start]!=' ')
				revChars(ch, start, i-1);
				start=i+1;
			}
			if(i==length-1 && ch[i]!=' ')
				revChars(ch, start, length-1);
		}
		
		
		return new String(ch);
	}
	
	private static void revChars(char[] ch, int l, int r){
		while(l<=r){
			char temp = ch[l];
			ch[l]=ch[r];
			ch[r]=temp;
			l++;
			r--;
		}
	}

}
