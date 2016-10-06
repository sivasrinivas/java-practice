package com.sivasrinivas.trees;

public class BSTCheck {
	public static Node prev = null;  
	
	
	public static void main(String[] args){
		Node root = new Node(8);
		root.left = new Node(2);
		root.right = new Node(9);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		
		BSTCheck bst = new BSTCheck();
		System.out.println(bst.checkBST(root));
	}
	
	
	public boolean checkBST(Node root){

		if(root != null){
			if(!checkBST(root.left))
				return false;
			if(prev!=null && prev.value>root.value)
				return false;
			prev = root;
			return checkBST(root.right);
		}
		
		return true;
	}
	
	public int minVal(Node root){
//		if(root==null)
//			return -1;
		while(root.left!=null)
			root = root.left;
		return root.value;
	}
	
	public int maxVal(Node root){
//		if(root==null)
//			return -1;
		while(root.right!=null)
			root = root.right;
		return root.value;
	}
}

class Node{
	int value;
	Node left = null;
	Node right = null;
	
	public Node(int v){
		this.value=v;
	}
}