package code;


public class ArraySubtract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {5,3,8,9,16};
		System.out.println(sum(array, 2));
	}
	
	public static int sum(int[] array, int n){
		int length = array.length;
		if(length==0){
			System.out.println("Empty array");
			return -1;
		}
		if(n>length){
			System.out.println("Iteration number exceeeded.");
			return -1;
		}
		int sum;
		if(n==0){
			sum=0;
			for(int i=0; i<length; i++){
				sum=sum+array[i];
			}
			return sum;
		}
		while(length>=2&&n>0){
			for(int i=0;i<length-1;i++){
				array[i]=array[i+1]-array[i];
			}
			length--;
			n--;
			
			for(int i=0;i<length;i++){
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
		sum=0;
		for(int i=0;i<length;i++){
			sum+=array[i];
		}
		return sum;
	}

}
