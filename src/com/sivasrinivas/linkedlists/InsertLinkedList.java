package com.sivasrinivas.linkedlists;

import java.io.IOException;
import java.util.*;


public class InsertLinkedList {

	/**
	 * @param args
	 */
	public static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter element to insert: ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		while(i!=-1){
			insert(i);
			i = scanner.nextInt();
		}
		System.out.println("*********************");
		System.out.println(list);
	}
	
	public static void insert(int val){
		System.out.println("inserting : "+val);
		if(list.size()==0){
			 list.add(val);
		}
		else {
			Iterator<Integer> ite = list.iterator();
			int i=0;
			int temp;
			while(ite.hasNext()){
				temp = ite.next();
				if(temp<val){
					i++;
				}
				else{
					list.add(i, val);
					break;
				}
			}
			if(!ite.hasNext())
			list.add(val);
		}
	}

}
