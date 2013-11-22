package com.sivasrinivas;


public class Square{
	private int a;
	int b;
	protected int c;
	public int d;
	public Square(int a){
		this.a=a;
	}
	
	public void print(){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Square s = new Square(3);
		s.print();
	}
}