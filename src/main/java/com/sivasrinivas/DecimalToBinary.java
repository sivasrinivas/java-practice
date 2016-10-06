package com.sivasrinivas;


public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 15;
		int a[] = new int[10];
		int index=0;
		while(n>0){
			if((n&1)>0){
				a[index]=1;
			}
			else{
				a[index]=0;
			}
			n=n>>1;
			index++;
		}
		for(int i=index-1; i>=0;i--)
			System.out.print(a[i]);
		
		//binary to decimal
		int mul = 1;
		int decimal=0;
		for(int i=0; i<index; i++){
			decimal+=a[i]*mul;
			mul=mul<<1;
		}
		System.out.println();
		System.out.println(decimal);
	}

}
