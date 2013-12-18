package com.sivasrinivas.trees;

import java.util.Stack;
/**
 * http://leetcode.com/2010/04/binary-search-tree-in-order-traversal.html
 * @author Siva
 *
 */
public class Inorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(2);
		root.right = new Node(9);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		
		inorderNonRecursive(root);

	}
	
	public static void inorderNonRecursive(Node root){
		Stack<Node> stack = new Stack<Node>();
		Node current = root;
		while(!stack.isEmpty() || current!=null){
			if(current!=null){
				stack.push(current);
				current = current.left;
			}else{
				current = stack.pop();
				System.out.print(current.value+"->");
				current = current.right;
			}
		}
	}

}
