package com.sivasrinivas;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintBinaryTree pbt = new PrintBinaryTree();
		TreeNode root = new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(7);
		root.right.left=new TreeNode(6);
				
		pbt.print(root);
	}
	
	public void print(TreeNode root){
		if(root == null)
			return;
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		list.add(root);
		getLevel(list);
	}
	
	public void getLevel(LinkedList<TreeNode> list){

		LinkedList<TreeNode> nextList = new LinkedList<TreeNode>();
		while(!list.isEmpty()){
			TreeNode item = list.remove();
			System.out.println(" "+item.val);
			System.out.print(" "+item.left+" "+item.right);
			if(item.left!=null)
				nextList.add(item.left);
			if(item.right!=null)
				nextList.add(item.right);
		}
		System.out.println();
		if(!nextList.isEmpty())getLevel( nextList);
		
	}
	
	public String getPadding(int index){
		String padding = "";
		for(int i=index; i>0;i++){
			padding = padding+"-";
		}
		return padding;
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
	public String toString(){
		return new String(""+val);
	}
}