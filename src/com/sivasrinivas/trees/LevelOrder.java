package com.sivasrinivas.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.right = new TreeNode(5);
//		printByLevel(root);
		levelOrderRecursion(root);
	}
	
	public static void printByLevel(TreeNode root){
		if(root==null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			//initialize i to size
			for(int i=q.size(); i>0; i--){
				TreeNode node = q.poll();
				System.out.print(node.val+",");
				if(node.left!=null)
					q.add(node.left);
				if(node.right!=null)
					q.add(node.right);
			}
			System.out.println();
		}
	}
	
	public static void levelOrderRecursion(TreeNode root){
		if(root==null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		levelOrderRecursionUtil(q);
	}
	
	public static void levelOrderRecursionUtil(Queue<TreeNode> q){
		if(q==null || q.size()==0)
			return;
		Queue<TreeNode> nextQ = new LinkedList<TreeNode>();
		while(!q.isEmpty()){
			TreeNode node = q.poll();
			System.out.print(node.val+" ");
			if(node.left!=null)
				nextQ.add(node.left);
			if(node.right!=null)
				nextQ.add(node.right);
		}
		System.out.println();
		levelOrderRecursionUtil(nextQ);
	}

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val){
		this.val=val;
		left=null;
		right=null;
	}
}