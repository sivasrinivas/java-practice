package com.sivasrinivas.trees;

import java.util.LinkedList;
import java.util.Queue;

public class FullBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		
		System.out.println(isFullBinary(root));
	}
	/**
	 * check weather given binary tree is full binary tree or not
	 * using level order
	 * @param root
	 * @return
	 */
	public static boolean isFullBinary(Node root){
		if(root==null)
			return true;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			boolean leafFound = false;
			for(int i=q.size(); i>0; i--){
				Node node = q.poll();
				System.out.print(node.value+" ");
				if(isLeaf(node))
					leafFound=true;
				if(node.left!=null)
					q.offer(node.left);
				if(node.right!=null)
					q.offer(node.right);
			}
			System.out.println();
			if(leafFound && !q.isEmpty())
				return false;
		}
		
		return true;
	}
	
	public static boolean isLeaf(Node node){
		if(node.left==null && node.right==null)
			return true;
		else
			return false;
	}
}
