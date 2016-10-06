package com.sivasrinivas.arrays;

import java.util.ArrayList;

public class IncreasingPairSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IncreasingPairSequence ips = new IncreasingPairSequence();
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		pairs.add(new Pair(1,2));
		pairs.add(new Pair(3,4));
		pairs.add(new Pair(1,2));
		pairs.add(new Pair(3,4));
		pairs.add(new Pair(5,7));
		pairs.add(new Pair(9,10));
		
		ips.printMaxSequence(pairs);
	}

	public void printMaxSequence(ArrayList<Pair> array){
		if(array==null)
			return;
		else if(array.size()==1){
			System.out.println(array.get(0).toString());
		}else{
			int start=0, end=0, newStart=0;
			int runCount=1, maxCount=1;
			
			for(int i=1;i<=array.size()-1;i++){
				if(array.get(i-1).compareTo(array.get(i))<0)
					runCount++;
				else{
					newStart=i;
					runCount=1;
				}
				if(runCount>maxCount){
					maxCount=runCount;
					start=newStart;
					end=i;
				}
			}
			System.out.println(start);
			System.out.println(end);
			for(int i=start;i<=end;i++)
			System.out.println(array.get(i));
		}
	}
	
}

class Pair implements Comparable{
	int a;
	int b;
	public Pair(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public String toString(){
		return "["+a+","+b+"]";
	}

	@Override
	public int compareTo(Object o) {
		Pair obj = (Pair) o;
		if(b==obj.a)
			return 0;
		else if(b<obj.a)
			return -1;
		else
			return 1;
	}
}
