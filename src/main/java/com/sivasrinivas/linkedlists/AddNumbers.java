package com.sivasrinivas.linkedlists;

public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(9);
		head1.next = new Node(9);
		head1.next.next = new Node(9);
		head1.next.next.next = new Node(9);
		
		Node head2 = new Node(9);
		head2.next = new Node(9);
//		head2.next.next = new Node(9);
		
		Node result = addNumbers(head1, head2);
		while(result!=null){
			System.out.print(result.val+"->");
			result=result.next;
		}
	}
	
	public static int findLength(Node head){
		if(head==null)
			return 0;
		int count=0;
		while(head!=null){
			head=head.next;
			count++;
		}
		return count;
	}
	
	public static Node addNumbers(Node head1, Node head2){
		
		int n1 = findLength(head1);
		int n2 = findLength(head2);
		if(n1==0&&n2==0)
			return null;
		if(n1==0)return head2;
		if(n2==0)return head1;
		
		if(n1<n2) return addNumbers(head2, head1);
		if(n1==n2) return addSameSize(head1, head2);
		Node cur1 = head1;
		for(int i=0; i<n1-n2; i++)
			cur1=cur1.next;
		
		Node result = addSameSize(cur1, head2);
		int carry = 0;
		if(result.val>=10){
			carry=1;
			result.val=result.val%10;
		}
		result = addRemaining(head1, cur1, result, carry);
		/*finally, we need to check head value 
		 * if it is greater than equal to 10, create new node*/
		if(result!=null && result.val>=10){
			Node temp = new Node(1);
			result.val=result.val%10;
			temp.next=result;
			result=temp;
		}
		return result;
	}
	
	public static Node addRemaining(Node head1, Node cur1, Node result, int carry){
		
		if(head1.next==cur1){
			head1.val = head1.val+carry;
			head1.next=result;
		}else{
			Node tempResult = addRemaining(head1.next, cur1, result, carry);
			if(tempResult.val>=10){
				tempResult.val=tempResult.val%10;
				head1.val=head1.val+1;
			}
			head1.next=tempResult;
		}
		result=head1;
		return result;
	}
	
	public static Node addSameSize(Node head1, Node head2){
		if(head1==null && head2==null)
			return null;
		Node prev = addSameSize(head1.next, head2.next);
		int carry = 0;
		if(prev!=null && prev.val>=10){
			carry = 1;
			prev.val=prev.val%10;
		}
		int sum = head1.val+head2.val+carry;
		Node result = new Node(sum);
		result.next=prev;
		
		return result;
	}

}
