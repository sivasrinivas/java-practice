package com.sivasrinivas.strings;

import java.util.Scanner;


public class ReplaceSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner scanner = new Scanner(System.in);
		char[] str = scanner.nextLine().toCharArray();
		replace(str, str.length);
	}
	
	public static void replace(char[] str, int length){
		int i=0, newLength=0, spCount=0;
		for(i=0;i<length;i++){
			if(str[i]==' ')
				spCount++;
		}
		newLength = length+2*spCount;
		char[] rep = new char[newLength];
		int j=0;
		for(i=0, j=0;i<length;i++){
			if(str[i]==' '){
				rep[j]='%';
				rep[j+1]='2';
				rep[j+2]='0';
				j=j+3;
			}
			else{
				rep[j] = str[i];
				j++;
			}
		}
		System.out.println(rep);
		System.out.println(rep.length);
	}

}
