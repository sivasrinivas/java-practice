package code;


public class QuickSort {

	/**
	 * @param args
	 */
	public static int[] a = {4,5,2,9,0,6,8};
	public static void main(String[] args) {
		
		quickSort(0, a.length-1);
		
		for(int i=0; i<a.length; i++)
		System.out.print(a[i]+" ");
		
	}
	
	public static void quickSort(int min, int max){
		if(min<max){
			int partion = partion(min, max);
			quickSort(min, partion-1);
			quickSort(partion+1, max);
		}
	}

	public static int partion(int left, int right){
		int store = left;
		int mid = left+right/2;
		swap(mid, right);
		
		for(int i=left; i<right; i++){
			if(a[i]<=a[right]){
				swap(i, store);
				store++;
			}
		}
		swap(store, right);
		
		return store;
	}
	
	public static void swap(int i , int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}
}
