package com.sivasrinivas.strings;

import java.util.ArrayList;
import java.util.HashMap;

public class SuffixTree {

	SuffixTreeNode root;
	
	public SuffixTree(String s){
		root = new SuffixTreeNode();
		if(s==null)	return;
		for(int i=0; i<s.length(); i++){
			root.insertString(s.substring(i), i);
		}
	}
	
	public ArrayList<Integer> getIndices(String s){
		return root.getIndices(s);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SuffixTree tree = new SuffixTree("bibs");
		ArrayList<Integer> indices = tree.getIndices("ssas");
		for(int i : indices){
			System.out.println(i);
		}
	}

}

class SuffixTreeNode{
	HashMap<Character, SuffixTreeNode> children = new HashMap<Character, SuffixTreeNode>();
	char value;
	ArrayList<Integer> indices = new ArrayList<Integer>();
	public SuffixTreeNode(){}
	
	public void insertString(String s, int index){
		indices.add(index);
		if(s!=null && s.length()>0){
			value = s.charAt(0);
			SuffixTreeNode child;
			if(children.containsKey(value)){
				child = children.get(value);
			}else{
				child = new SuffixTreeNode();
				children.put(value, child);
			}
			child.insertString(s.substring(1), index);
		}
	}
	
	public ArrayList<Integer> getIndices(String s){
		if(s==null || s.length()==0){
			return indices;
		}
		char first = s.charAt(0);
		if(children.containsKey(first)){
			return children.get(first).getIndices(s.substring(1));
		}
		return null;
	}
}