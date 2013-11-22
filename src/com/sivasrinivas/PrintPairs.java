package code;

import java.util.*;


public class PrintPairs {

	public static void main(String[] args){
		int sum = 2;
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(0);
		System.out.println(list.toString());
		
		//without duplicate pairs/elements
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.addAll(list);
		System.out.println(hashSet.toString());
		Iterator<Integer> ite = hashSet.iterator();
		Integer cur=0;
		Integer j=0;
		while(ite.hasNext()){
			cur = ite.next();
			if(cur==sum-cur){
				continue;
			}
			else if(hashSet.contains(sum-cur)){
				j=sum-cur;
				System.out.println(cur+"+"+j+"="+sum);
			}
				
		}
		System.out.println("**************************************");
		//with duplicate elements/pairs
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0; i<list.size();i++){
			if(hashMap.containsKey(list.get(i))){
				hashMap.put(list.get(i), hashMap.get(list.get(i))+1);
			}
			else
			hashMap.put(list.get(i),1);
		}
		System.out.println(hashMap.toString());
		int temp=0;
		for(int i=0; i<list.size();i++){
			if(hashMap.containsKey(sum-list.get(i))){
				//
				if(sum-list.get(i)==list.get(i))
					temp=1;
				if(hashMap.get(sum-list.get(i)) != null){
					for(int k=0;k<hashMap.get(sum-list.get(i))-temp;k++){
						int sumTemp=sum-list.get(i);
						System.out.println(list.get(i)+"+"+sumTemp+"="+sum);
					}
				}
				
			}
		}
	}
	
}
