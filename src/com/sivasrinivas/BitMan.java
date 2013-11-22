package code;


public class BitMan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitMan bm = new BitMan();
		System.out.println(bm.setBits(1024, 21, 2,6));
	}

	int setBits(int n, int m, int i, int j){
		
		int max=~0;
		int left = max - ((1<<j)-1);
		int right = (1<<i) - 1;
		int mask = left|right;
		
		return (n&mask)|(m<<i);
	}
}
