package com.sivasrinivas.arrays;

import java.util.Arrays;
/**Finds lcm of n numbers
 * http://math.stackexchange.com/questions/319297/gcd-to-lcm-of-multiple-numbers
 * @author Siva
 *
 */
public class LCM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2};
		System.out.println(calculateLCM(a));
	}
	
	public static int calculateLCM(int[] a){
		int[] prod = new int[a.length];
		
		int p=1;
		for(int i=0; i<a.length; i++){
			prod[i]=p;
			p*=a[i];
		}
		p=1;
		for(int i=a.length-1; i>=0; i--){
			prod[i]*=p; //multiplying, not assigning
			p*=a[i];
		}
		
		//another way to get products do a[i]=product of all numbers/a[i];
		
		int n = prod[0]*a[0]; //product all numbers
		int gcd = prod[0];
		for(int i=1; i<a.length; i++){
			gcd = gcd(gcd, prod[i]);
		}
		
		return n/gcd;
	}
	
	public static int gcd(int a, int b){
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

}
