package com.sivasrinivas.linkedlists;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		
		System.out.println(isPalindrome(head));	
	}
	
	public static boolean isPalindrome(Node head){
		Node middle = middle(head);
		middle=reverse(middle);
		while(head!=null&&middle!=null){
			if(head.val!=middle.val)
				return false;
			head=head.next;
			middle=middle.next;
		}
		return true;
	}
	//if odd number, fast will be not null and move slow by one pointer
	//if even number, fast will be null and no need to movie slow by one pointer
	public static Node middle(Node head){
		if(head==null || head.next==null)return head;
		Node slow=head;
		Node fast = head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null)
			slow=slow.next;
		return slow;
	}
	
	public static Node reverse(Node head){
		Node prev=null;
		Node current= head;
		while(current!=null){
			Node next = current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}

}
