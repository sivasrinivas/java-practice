package com.sivasrinivas.trees;

import java.util.Stack;

public class PathSequential {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Node root = new Node(8);
		root.left = new Node(2);
		root.right = new Node(9);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		
		path(root, 1);
	}
	
	public static void path(Node root, int k){
		Stack<Node> stack = new Stack<Node>();
		pathUtil(root, k, stack);
		while(!stack.isEmpty()){
			System.out.print(stack.pop().value+"->");
		}
	}
	
	private static boolean pathUtil(Node root, int k, Stack stack){
		if(root == null)
			return false;
		if(pathUtil(root.left, k, stack) || pathUtil(root.right, k, stack)){
			stack.push(root);
			return true;
		}else{
			if(root.value==k){
				stack.push(root);
				return true;
			}
		}
		
		return false;
	}

}
