package com.sivasrinivas.linkedlists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
//		list.add("E");
		printThreeItems(list.iterator());
	}
	
	public static void printThreeItems(Iterator<String> ite){
	    if(ite==null){
	        System.out.println("Invalid iterator");
	        return;
	    }
	    int i=0;
	    String[] words=new String[3];
	    for( i=0; i<3 && ite.hasNext(); i++){
	       words[i]=ite.next();
	    }
	    for(int j=0; j<i; j++){
	        System.out.print(words[j]);
	    }
	    System.out.println();
	    if(i!=3){
	        return;
	    }
	    
	    while(ite.hasNext()){
	        words[0]=words[1];
	        words[1]=words[2];
	        words[2]=ite.next();
	        for(int j=0; j<3; j++){
	            System.out.print(words[j]);
	        }
	         System.out.println();
	    }
	}
}


