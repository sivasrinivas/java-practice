package code;


public class ReplaceWithRightMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {45,31,40,39,37,41};
		int length = a.length;
		int curMinDiff = 0;
		int minDiff = 0;
		int minIndex=0;
		int temp=0;
		
		for(int i=0;i<length;i++){
			curMinDiff=0;
			minDiff=10000;
			minIndex=i;
			for(int j=i+1;j<length;j++){
				if(a[i]>=a[j])
					continue;
				curMinDiff=Math.abs(a[i]-a[j]);
				if(curMinDiff<minDiff){
					minDiff=curMinDiff;
					minIndex=j;
				}
			}
			//swap a[i] and a[minIndex]
			temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		for(int i:a)
		System.out.println(i);
	}
}
