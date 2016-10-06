package com.sivasrinivas.linkedlists;

public class ReverseAlternateNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head  = reverseAlternate(head);
		while(head!=null){
			System.out.print(head.val+",");
			head=head.next;
		}
	}
	
	public static Node reverseAlternate(Node head){
		if(head==null || head.next==null)
			return head;
		Node dupHead = head.next;
		Node current = head;
		Node prev = dupHead;
		while(current!=null && current.next!=null){
			Node third = current.next.next;
			Node second = current.next;
			
			prev.next=second;
			second.next=current;
			current.next=third;
			
			prev=current;
			current = third;
		}
		return dupHead;
	}


}
