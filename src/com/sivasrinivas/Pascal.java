package code;

public class Pascal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = new int[index(4, 3)];
		a[0] = 1;
		a[1]=a[2]=1;
		for (int i = 2; i < 4; i++) {
			a[index(i, 0)] = 1;
			for (int j = 1; j < i; j++)
				a[index(i, j)] = a[index(i - 1, j - 1)] + a[index(i - 1, j)];
		}

		for(int i=0; i<a.length;i++)
			System.out.println(a[i]);
	}

	public static int index(int i, int j) {
		int sum = 0;
		for (int t = 0; t <= i; t++)
			sum = sum + t;
		sum = sum + j;
		return sum;
	}

}
