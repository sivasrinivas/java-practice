package com.sivasrinivas;

public class LinkedListRev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListRev lr = new LinkedListRev();
		Node head = lr.new Node(5);
		head.next=lr.new Node(3);
		head.next.next=lr.new Node(4);
		head.next.next.next=lr.new Node(1);
		head=lr.rreverse(head);
		lr.print(head);
	}

	//iterative approach
	public Node reverse(Node head){
		if(head==null || head.next==null)
			return head;
		Node prev=null;
		Node cur = head;
		Node next;
		while(cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
			
	}
	//reverse using recursion
	public Node rreverse(Node head){
		if(head==null || head.next==null)
			return head;
		Node next = head.next;
		head.next=null;
		Node remainingList = rreverse(next);
		next.next=head;
		return remainingList;
	}
	
	public void print(Node head){
		while(head!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
		System.out.println();
	}
	
	private class Node{
		int val;
		Node next;
		public Node(int val){
			this.val=val;
			this.next=null;
		}
	}
	
}
