package com.sivasrinivas;

public class ObjectCreation {
	public static void main(String args[]){
		System.out.println(Sample.j);
		Boolean b = Boolean.TRUE;
		System.out.println(b.booleanValue());
		b = false;
		System.out.println(b.booleanValue());
		
		Sample s = new Sample();
	}
	
}

class TestS implements Test{

	@Override
	protected void testafsd() {
		// TODO Auto-generated method stub
		
	}
	
}

class Sample extends Number{
	private static int i=0;
	static int j=1;
	
	@Override
	public int intValue() {
		return 0;
	}
	@Override
	public long longValue() {
		return 0;
	}
	@Override
	public float floatValue() {
		return 0;
	}
	@Override
	public double doubleValue() {
		return 0;
	}
}