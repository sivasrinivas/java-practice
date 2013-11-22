package com.sivasrinivas;

public class Sample {
	public static void main(String[] args) {
		
	}

	public static void sort(int[] a){
		if(a==null)
			return;
		if(a.length==0 || a.length==1)
			return;
		int length = a.length;
		for(int i=0, checker=0; i<length; i++){
			if(a[i]>0){
				while(checker<length && a[checker]>0)
					checker++;
				swap(a, i, checker);
			}
		}
	}


	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}	