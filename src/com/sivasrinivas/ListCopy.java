package com.sivasrinivas;

public class ListCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next=new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		ListCopy lc = new ListCopy();
		
		Node copy = lc.copyOf(head);
		
		System.out.println(copy.val);
		System.out.println(copy.next.val);
		System.out.println(copy.next.next.val);
		System.out.println(copy.next.next.next.val);
	}
	
	public Node copyOf(Node org){
		Node copy=null;
		Node head = org;
		//creating node in between original nodes
		while(head!=null){
			Node t = new Node(head.val);
			t.next=head.next;
			head.next=t;
			head=head.next.next;
		}
		
		//assigning random pointers for copy nodes
		head = org;
		copy = head.next;
		while(head!=null){
			head.next.rand=head.rand.next;
			head = head.next.next;
		}
		
		//separate copy nodes and original nodes
		head = org;
		copy = head.next;
		while(head!=null){
			head.next=head.next.next;
			copy.next=copy.next.next;
			head=head.next;
		}
		return copy;
	}

}

class Node{
	int val;
	Node next;
	Node rand;
	public Node(int val){
		this.val = val;
		next = null;
		rand=null;
	}
}
