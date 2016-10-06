package com.sivasrinivas.linkedlists;

public class ListCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandNode head = new RandNode(1);
		head.next=new RandNode(2);
		head.next.next = new RandNode(3);
		head.next.next.next = new RandNode(4);
		
		ListCopy lc = new ListCopy();
		
		RandNode copy = lc.copyOf(head);
		
		System.out.println(copy.val);
		System.out.println(copy.next.val);
		System.out.println(copy.next.next.val);
		System.out.println(copy.next.next.next.val);
	}
	
	public RandNode copyOf(RandNode org){
		RandNode copy=null;
		RandNode head = org;
		//creating RandNode in between original RandNodes
		while(head!=null){
			RandNode t = new RandNode(head.val);
			t.next=head.next;
			head.next=t;
			head=head.next.next;
		}
		
		//assigning random pointers for copy RandNodes
		head = org;
		copy = head.next;
		while(head!=null){
			head.next.rand=head.rand.next;
			head = head.next.next;
		}
		
		//separate copy RandNodes and original RandNodes
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

class RandNode{
	int val;
	RandNode next;
	RandNode rand;
	public RandNode(int val){
		this.val = val;
		next = null;
		rand=null;
	}
}
