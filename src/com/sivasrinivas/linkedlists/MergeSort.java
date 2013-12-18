package com.sivasrinivas.linkedlists;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//The main function
	public Node merge_sort(Node head) {
	  if(head == null || head.next == null) { return head; }
	  Node middle = getMiddle(head);      //get the middle of the list
	  Node sHalf = middle.next; middle.next = null;   //split the list into two halfs

	  return merge(merge_sort(head),merge_sort(sHalf));  //recurse on that
	}

	//Merge subroutine to merge two sorted lists
	public Node merge(Node a, Node b) {
	  Node dummyHead, curr; 
	  dummyHead = new Node(); 
	  curr = dummyHead;
	  while(a !=null && b!= null) {
	      if(a.val <= b.val) { 
	    	  curr.next = a; 
	    	  a = a.next; 
	      }
	      else { 
	    	  curr.next = b; 
	    	  b = b.next; 
	      }
	      curr = curr.next;
	  }
	  curr.next = (a == null) ? b : a;
	  return dummyHead.next;
	}

	//Finding the middle element of the list for splitting
	public Node getMiddle(Node head) {
	  if(head == null) { return head; }
	  Node slow, fast; slow = fast = head;
	  while(fast.next != null && fast.next.next != null) {
	      slow = slow.next; fast = fast.next.next;
	  }
	  return slow;
	}
}

class Node {
	int val;
	Node next;
	public Node(int val){
		this.val=val;
		next=null;
	}
	
	public Node(){
		this.val=0;
		next=null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + val;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Node other = (Node) obj;
		if (val != other.val) {
			return false;
		}
		return true;
	}
	
	public String toString(){
		return new String(Integer.toString(val));
	}
	
	
}