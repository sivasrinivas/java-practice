package com.sivasrinivas;

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
		
		int start=0;
		for(int i=0; i<length;i++){
			if(ch[i]!=' '){
				start=i;
				break;
			}
		}
		
		for(int i=start+1; i<length; i++){
			if(ch[i]==' '){
				if(ch[start]!=' ')
				revChars(ch, start, i-1);
				start=i+1;
			}
		}
		if(ch[length-1]!=' ')
			revChars(ch, start, length-1);
		
		return new String(ch, 0, length);
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
