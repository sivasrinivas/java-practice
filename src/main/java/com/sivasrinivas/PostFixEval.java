package com.sivasrinivas;

import java.util.Stack;

public class PostFixEval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(evaluate("3 4 -"));
	}

	public static int evaluate(String s){
		Stack<String> stack = new Stack<String>();
		String[] tokens = s.split(" ");
		for(String token : tokens){
			if(!"+".equals(token)&&!"-".equals(token)&&!"*".equals(token)&&!"/".equals(token))
				stack.push(token);
			else{
				int op2 = Integer.parseInt(stack.pop());
				int op1 = Integer.parseInt(stack.pop());
				int res = 0;
				if("+".equals(token)){
					res=op1+op2;
				}else if("-".equals(token)){
					res=op1-op2;
				}else if("*".equals(token)){
					res=op1*op2;
				}else if("/".equals(token)){
					res=op1/op2;
				}
				stack.push(Integer.toString(res));
			}
		}
		
		return Integer.parseInt(stack.pop());
	}
}
