package com.sivasrinivas.trees;

public class MinNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BSTNode root = new BSTNode(7);
		root.left = new BSTNode(3);
		root.right = new BSTNode(9);
		root.left.left = new BSTNode(1);
		root.left.right = new BSTNode(4);
		root.left.right.right = new BSTNode(5);
		
		System.out.println(find(root, 5).value);

	}
	
	public static BSTNode find(BSTNode root, int value){
			if(root == null)
				return null;
			if(root.value==value)
				return root;
			if(root.value<value)
				return findMin(root.right, value, root);
			else
				return findMin(root.left, value, root);
	}
	
	private static BSTNode findMin(BSTNode root, int value, BSTNode minNode){
		if(root==null)
			return minNode;
		if(root.value==value)
			return root;
		if( Math.abs(root.value-value)<Math.abs(minNode.value-value))
			minNode = root;
		
		if(root.value<value)
			return findMin(root.right, value, minNode);
		else
			return findMin(root.left, value, minNode);
	}

}

class BSTNode{
	int value;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(int value){
		this.value=value;
		left=null;
		right=null;
	}
}
