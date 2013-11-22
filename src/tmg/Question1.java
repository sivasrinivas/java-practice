package tmg;

public class Question1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,4};
		System.out.println(findSpy(array));
	}
	
	public static int findSpy(int[] soldiers){
		//checks for null condition
		if(soldiers==null)
			return -1;
		
		int actualSum=0;
		int expectedSum=0;
		//as there is one spy in the solderis, i am subtracting that from the array
		int size = soldiers.length-1;
		
		for(int i : soldiers)
			actualSum+=i;
		expectedSum = (size*(size+1))/2;
		//diff between actual and expected is the spy's patch number
		return actualSum-expectedSum;
	}

}
