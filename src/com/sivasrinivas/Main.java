package com.sivasrinivas;

class A {
	static int  count = 0;
	static void fun() {
		System.out.println("A.fun()");
	}
	
	public void test(){
		System.out.println("A.test()");
	}
}

class B extends A {
//	static void fun() {
//		System.out.println("B.fun()");
//	}
	static int count=1;
	public void test(){
		System.out.println("B.test()");
	}
}

public class Main {
	public static void main(String args[]) {
		A a = new B();
		a.fun(); // prints A.fun()
		System.out.println(B.count);
		System.out.println(a.count);
		B b = new B();
		b.fun();
		
//		A a1 = new B();
//		a1.test();
//		
//		B b1 = new B();
//		b1.test();
	}
}