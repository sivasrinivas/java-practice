package com.sivasrinivas.misc;

/**
 * Print elements of matrix in sprider order
 * input:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * output: 123698745
 * @author Siva
 *
 */
public class MatrixSpider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int count=1;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				a[i][j]=count;
				count++;
			}
		}
		
		print(a);
	}
	
	public static void print(int[][] a){
		//a.length - rows
		//a[0].length - columns
		if(a[0].length!=a.length)
			System.out.println("Not a square matrix");
		int n = a.length;
		
		for(int layer=0; layer<=n/2; layer++){
			int first = layer;
			int last = n-1-layer;
			
			for(int i=first; i<last; i++){
				System.out.print(a[first][i]+" ");
			}
			for(int i=first; i<last; i++){
				System.out.print(a[i][last]+" ");
			}
			for(int i=first; i<last; i++){
				int offset = i-first;
				System.out.print(a[last][last-offset]+" ");
			}
			for(int i=first; i<last; i++){
				int offset = i-first;
				System.out.print(a[last-offset][first]+" ");
			}
		}
		//if matrix odd length
		if((n&1)==1){
			System.out.println(a[n/2][n/2]);
		}
	}

}
