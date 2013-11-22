package com.sivasrinivas;

public class BSTCheck {
	public static node prev = null;  
	
	
	public static void main(String[] args){
		node root = new node(8);
		root.left = new node(2);
		root.right = new node(9);
		root.left.left = new node(1);
		root.left.right = new node(4);
		
		BSTCheck bst = new BSTCheck();
		System.out.println(bst.checkBST(root));
	}
	
	
	public boolean checkBST(node root){

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
	
	public int minVal(node root){
//		if(root==null)
//			return -1;
		while(root.left!=null)
			root = root.left;
		return root.value;
	}
	
	public int maxVal(node root){
//		if(root==null)
//			return -1;
		while(root.right!=null)
			root = root.right;
		return root.value;
	}
}

class node{
	int value;
	node left = null;
	node right = null;
	
	public node(int v){
		this.value=v;
	}
}