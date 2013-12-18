package com.sivasrinivas.misc;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		System.out.println(fibRecursive(n));
		System.out.println(fibiterative(n));
	}
	
	public static int fibRecursive(int n){
		if(n<=1)
			return 0;
		if(n==2)
			return 1;
		else return fibRecursive(n-1)+fibRecursive(n-2);
	}
	
	public static int fibiterative(int n){
		if(n<=0)
			return 0;
		int a=0, b=1;
		if(n==1) return a;
		if(n==2) return b;
		int c=0;
		for(int i=3; i<=n; i++){
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}

}
