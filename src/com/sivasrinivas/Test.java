package code;


public class Test {

	/**
	 * @param args
	 */
	
	private int test = 0;
	public static void main(String[] args) {
		int[] a = new int[3];
		System.out.println(a);
		Test t = new Test();
		System.out.println(t.test);
	}
	
	public void test(){
		test = 0;
	}

}
