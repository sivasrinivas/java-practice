package com.sivasrinivas;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LRUCache<K, V> extends LinkedHashMap<K, V>{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cache lru = new Cache<Integer, String>(3);
		lru.put(1, "Siva");
		lru.put(2, "s");
		lru.put(3, "V");
		lru.put(1, "Siva");
		lru.put(4, "A");
		System.out.println(lru.toString());
		System.out.println(lru.get(4));
	}
	
	private int capacity; // Maximum number of items in the cache.
    
    public LRUCache(int capacity) { 
        super(capacity+1, 1.0f, true); // Pass 'true' for accessOrder.
        this.capacity = capacity;
    }
     
    protected boolean removeEldestEntry(Entry entry) {
        return (size() > this.capacity);
    }

}

class Cache<K,V>{
	private int capacity;
	private Map<K, V> cache;
	
	public Cache(int capacity){
		this.capacity=capacity;
		cache = new LinkedHashMap<K, V>(capacity, 1.0f, true);
	}
	
	public void put(K key, V value){
		cache.put(key, value);
		
		if(removeEldestEntry()){
			Entry<K, V> entryToRemove = cache.entrySet().iterator().next();
			cache.remove(entryToRemove.getKey());
		}
	}
	
	public V get(K key){
		return cache.get(key);
	}
	
	protected boolean removeEldestEntry(){
		return cache.size()>this.capacity;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		Iterator ite = cache.entrySet().iterator();
		sb.append("[");
		while(ite.hasNext()){
			Entry<K, V> entry = (Entry<K, V>) ite.next();
			sb.append("[");
			sb.append(entry.getKey());
			sb.append(",");
			sb.append(entry.getValue());
			sb.append("]");
		}
		sb.append("]");
		return sb.toString();
	}
}
