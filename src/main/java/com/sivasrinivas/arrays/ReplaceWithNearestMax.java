package com.sivasrinivas.arrays;

import java.util.Arrays;
import java.util.Stack;

/**
 * Replace each number with its nearest max number
 * input: 5,3,4,6,1
 * output: 6,4,6,6,1
 * @author Siva
 *
 */
public class ReplaceWithNearestMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {2,3,4,6,1};
		replace(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void replace(int[] a){
		if(a==null || a.length==0)
			return;
		int length = a.length;
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(a[length-1]);
		for(int i=length-2; i>=0; i--){
			if(a[i]>stack.peek()){
				stack.push(a[i]);
			}else{
				while(stack.peek()<a[i])
					stack.pop();
				int temp = a[i];
				a[i]=stack.peek();
				stack.push(temp);
			}
		}
	}

}
