package code;


public class HeapSort {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int[] array = {9, 10, 3, 8, 1, 6, 4, 2, 17, 11};
		int length = array.length;
		array = buildHeap(array);
		for(int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
		
		//sort the heap in ascending order
		for(int i=length-1;i>0;i--){
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			array = heapify(array, 0, i);
		}
		for(int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	public static int[] buildHeap(int[] array){
		int length = array.length;
		for(int i=((length/2)-1); i>=0; i--){
			array=heapify(array,i,length);
		}
		return array;
		
	}
	
	public static int[] heapify(int[] array, int index, int length){
		
		int max = index;
		int left = index*2+1;
		int right = index*2+2;
		if(left<length && array[index]<array[left]){
			max=left;
		}
		
		if(right<length && array[index]<array[right]){
			max=right;
		}
		
		if(max!=index){
			int temp = array[index];
			array[index]=array[max];
			array[max]=temp;
			array = heapify(array, max, length);
		}
		return array;
	}

}
