package code;

import java.util.LinkedList;


public class LinkedListReversCheck {

	/**
	 * @param args
	 */
	
	public boolean isReverseSame(LinkedList<Integer> l1){
		
		int n=l1.size();
		int j=n-1;
		boolean b=true;
		
		for(int i=0; i<n/2;i++,j--){
			if(l1.get(i) != l1.get(j)){
				b=false;
				break;
			}
				
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListReversCheck link = new LinkedListReversCheck();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(2);
		l1.add(1);
		System.out.println(link.isReverseSame(l1));
	}

}
