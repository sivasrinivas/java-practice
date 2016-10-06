package com.sivasrinivas.trees;

import java.util.ArrayList;

public class ConnectSameLevelNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(2);
		root.right = new Node(9);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.left.left.left = new Node(0);
		
		ArrayList<ArrayList<Node>> list = getLevels(root);
		for(ArrayList<Node> levelList : list){
			for(Node nod : levelList){
				System.out.print(nod.value+"->");
			}
			System.out.println();
		}
	}
	
	public static ArrayList<ArrayList<Node>> getLevels(Node root){
		if(root == null)
			return null;
		ArrayList<ArrayList<Node>> list = new ArrayList<ArrayList<Node>>();
		getLevelsUtil(root, list, 0);
		return list;
	}
	
	private static void getLevelsUtil(Node root, ArrayList<ArrayList<Node>> list, int level){
		if(root==null)
			return;
		if(list.size()==level){
			ArrayList<Node> levelList = new ArrayList<Node>();
			levelList.add(root);
			list.add(level,levelList);
		}else{
			list.get(level).add(root);
		}
		getLevelsUtil(root.left, list, level+1);
		getLevelsUtil(root.right, list, level+1);
	}

}
