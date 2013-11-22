package code;

import java.util.LinkedList;
import java.util.Queue;


public class Trees {

	/**
	 * @param args
	 */
	
	static Node root;
	public static void main(String[] args) {
		 root = new Node(5);
		root.left = new Node(2);
		root.right = new Node(7);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.left.right.left = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(9);
		
		
//		Queue<Node> queue = new LinkedList<Node>();
//		queue.add(root);
//		levelOrder(queue);
		
//		inOrder(root);
		
		System.out.println(distance(root, 1,11));
	}

	public static int distance(Node root, int min, int max){
		
		Node lca = lca(root, min, max);
		System.out.println(lca.value);
		int i= distance(lca,min);
		int j = distance(lca,max);
		if(i<0 || j<0){
			System.out.println("One of the given element is not found");
			return -1;
		}
		
		else return i+j;
				
	}
	
	public static Node lca(Node root, int min, int max){
		
		if(min<root.value && max<root.value)
			return lca(root.left, min, max);
		else if(min>root.value && max>root.value)
			return lca(root.right, min, max);
		else if(min<root.value && root.value<max)
			return root;
		else 
			return null;
	}
	
	public static int distance(Node root, int value){
		int distance = 0;
		if(root==null)
			return -1;
		if(root.value==value)
			distance = 0;
		else if(value<root.value)
			distance = distance(root.left, value);
		else
			distance = distance(root.right, value);
		
		if(distance<0)
			return distance;
		else 
			return distance+1;
	}
	
	public static void levelOrder(@SuppressWarnings("rawtypes") Queue queue) {
		Queue<Node> next = new LinkedList<Node>();
		
		while(!queue.isEmpty()){
			Node node = (Node) queue.remove();
			if(node!=null){
				System.out.print(node.value+" ");
				next.add(node.left);
				next.add(node.right);
			}
		}
		System.out.println();
		if(next.size()>0)
			levelOrder(next);
	}
	
	public static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.value);
			inOrder(root.right);
		}
	}
}


class Node{
	int value;
	Node left;
	Node right;
	public Node(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
}