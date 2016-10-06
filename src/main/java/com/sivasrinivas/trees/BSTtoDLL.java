package com.sivasrinivas.trees;

public class BSTtoDLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(2);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		
		root=convertToDLL(root);
		while(root!=null){
			System.out.print(root.val+"->");
			root=root.right;
		}
	}
	
	public static TreeNode convertToDLL(TreeNode root){
		if(root==null)return root;
		convertUtil(root);
		while(root.left!=null){
			root=root.left;
		}
	
		return root;
	}
	
	public static TreeNode convertUtil(TreeNode root){
		if(root==null) return null;
		TreeNode left = convertUtil(root.left);
		if(left!=null){
			while(left.right!=null){
				left=left.right;
			}
			left.right=root;
			root.left=left;
			
		}
		
		TreeNode right = convertUtil(root.right);
		if(right!=null){
			while(right.left!=null){
				right=right.left;
			}
			right.left=root;
			root.right=right;
		}
		return root;
	}

}
