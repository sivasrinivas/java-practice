package com.sivasrinivas.linkedlists;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(1);
		head.next.next = new Node(1);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(1);
		removeDuplicates(head);
		while(head!=null){
			System.out.print(head.val+",");
			head=head.next;
		}
	}
	
	public static void removeDuplicates(Node head){
		
		if(head==null || head.next==null)
			return;
		HashSet<Node> set = new HashSet<Node>();
		set.add(head);
		Node current = head.next;
		Node prev = head;
		while(current!=null){
			if(set.contains(current)){
				prev.next=current.next;
			}else{
				set.add(current);
				prev=current;
			}
			current = current.next;
		}
		System.out.println(Arrays.toString(set.toArray()));
	}
	
}
