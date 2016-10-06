package com.sivasrinivas.strings;
/**
 * Replace spaces in the given string1 with another string2
 * @author Siva
 *
 */
public class ReplaceSpaceWithString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(replaceSpaces("a  b", "def"));
	}
	
	public static String replaceSpaces(String input, String pattern){
		int length = input.length();
		int count=0;
		for(int i=0;i<length;i++){
			if(input.charAt(i)==' ')
				count++;
		}
		char[] result = new char[length+count*pattern.length()-count];
		
		int j=result.length-1;
		for(int i=length-1; i>=0; i--){
			char ch = input.charAt(i);
			if(ch==' '){
				copy(result, j, pattern);
				j=j-pattern.length();
			}else{
				result[j]=ch;
				j--;
			}
		}
		
		return new String(result);
	}
	
	public static void copy(char[] result, int pos, String pattern){
		int k = pattern.length()-1;
		for(int i=pos; i>=0&&k>=0; i--,k--){
			result[i]=pattern.charAt(k);
		}
	}

}
