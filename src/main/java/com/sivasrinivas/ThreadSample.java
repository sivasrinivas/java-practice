package com.sivasrinivas;

public class ThreadSample {

	private int count=0;
	
	public static void main(String[] args) {
		ThreadSample ts = new ThreadSample();
		Runner run1 = new Runner(ts);
		Runner run2 = new Runner(ts);
		run1.start();
		run2.start();
		try {
			run1.join();
			run2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ts.count);
	}

	public synchronized void increment(){
		count++;
	}
}

class Runner extends Thread{
	ThreadSample ts;
	public Runner(ThreadSample ts){
		this.ts=ts;
	}
	public void run(){
		for(int i=0; i<100; i++)
		ts.increment();
	}
	
}