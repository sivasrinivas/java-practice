/**
 * 
 */
package com.sivasrinivas.misc;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Siva
 *
 */
public class MyHashTable<K,V> {

	
	private MyEntry<K,V>[] table;
	
	public MyHashTable(){
		table = new MyEntry[10];
	}
	
	public void put(K key, V value){
		int index = getBucket(key);
		MyEntry<K, V> current = table[index];
		if(current==null)
			table[index]=new MyEntry(key, value);
		else{
			while(current.next!=null)
				current=current.next;
			current.next=new MyEntry(key, value);
		}
	}
	
	public V getValue(K key){
		int index = getBucket(key);
		MyEntry<K, V> current = table[index];
		if(current==null)
			return null;
		else{
			while(!current.key.equals(key))
				current=current.next;
			return current.value;
		}
	}
	
	private int getBucket(K key){
		int hash = key.hashCode();
		return hash%10;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyHashTable<Integer, String> table = new MyHashTable<Integer, String>();
		table.put(2, "2");
		table.put(12, "4");
		System.out.println(table.getValue(12));
	}

}

class MyEntry<K, V>{
	K key;
	V value;
	MyEntry next;
	public MyEntry(K key, V value){
		this.key=key;
		this.value=value;
		next=null;
	}
}