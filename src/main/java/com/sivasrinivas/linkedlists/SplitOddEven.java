package com.sivasrinivas.linkedlists;

public class SplitOddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(2);
		head1.next = new Node(5);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(8);
		split(head1);
	}
	
	public static void split(Node list){
		if(list==null)
			return;
		Node a = new Node(0);
		Node b = new Node(0);
		Node even = a;
		Node odd = b;
		while(list!=null){
			if(list.val%2==0){
				a.next=list;
				a=a.next;
			}else{
				b.next=list;
				b=b.next;
			}
			list=list.next;
		}
		a.next=null;
		b.next=null;
		
		even=even.next;
		odd=odd.next;
		while(even!=null){
			System.out.print(even.val+",");
			even=even.next;
		}
		System.out.println();
		while(odd!=null){
			System.out.print(odd.val+",");
			odd=odd.next;
		}
	}

}
