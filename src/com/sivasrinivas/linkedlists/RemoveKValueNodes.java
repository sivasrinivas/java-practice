package com.sivasrinivas.linkedlists;

public class RemoveKValueNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head= new Node(1);
		head.next=new Node(3);
		head.next.next=new Node(3);
		head.next.next.next=new Node(2);
		head.next.next.next.next=new Node(3);
		head=removeK(head, 3);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
	
	public static Node removeK(Node head, int k){
		if(head==null)
			return head;
		while(head.val==k ){
			head=head.next;
			if(head==null){
				return head;
			}
		}
		Node dummy=head;
		Node cur=head.next;
		while(cur!=null){
			if(cur.val!=k){
				dummy.next=cur;
				dummy=dummy.next;
				
			}
			cur=cur.next;
		}
		dummy.next=null;
		return head;
	}

}
