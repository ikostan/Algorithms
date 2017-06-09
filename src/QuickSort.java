import java.util.Arrays;
import java.util.Random;

public class QuickSort extends SearchClass implements SearchMethod, Runnable{

	//Class fields
	static private String className = "Quick Sort";

	//Constructor
	QuickSort() {
		super(className);
	}
		
	//Constructor
	QuickSort(int[] newArray) {
		super(className, newArray);
	}
	
	@Override
	public void sort() {

		Integer iterations = new Integer(0);
		
		int[] array =  new int[super.getDataObj().length];
		
		for(int indx = 0; indx < super.getDataObj().length; indx++){
			array[indx] = super.getDataObj()[indx];
		}
		
		String start = "Unsorted array\n" + Arrays.toString(array);
		System.out.println(start + "\n");
		
		quickSort(array, iterations); //QuickSort method
		
		String output = "\nArray is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");
		
	}
	
	//Main method
	public static void quickSort(int[] array, Integer iterations){
		
		quickSort(array, 0, array.length - 1, iterations);
	}
	
	//Sub-method
	private static void quickSort(int[] array, int left, int right, Integer iterations){
		
		if(left >= right){
			
			return;
		}

		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot, iterations);
		quickSort(array, left, index - 1, iterations);
		quickSort(array, index, right, iterations);
	}
	
	//Partitioning method
	private static int partition(int[] array, int left, int right, int pivot, Integer iterations){
		
		int index  = 0;
		
		while(left <= right){
			
			while(array[left] < pivot){
				left++;
				iterations++;
			}
			
			while(array[right] > pivot){
				right--;
				iterations++;
			}
			
			if(left <= right){
				
				//Swap
				int temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				
				left++;
				right--;
			}
		}
		
		return left;
	}
	
	
	@Override
	public void search() {}
	
	
	//Multi-Threading
	@Override
	public void run() {
			
		System.out.println(String.format("Thread Started -> %s", super.getDescription()));
		search();
		System.out.println(String.format("Thread Finished -> %s\n", super.getDescription()));
	}
	
	//END OF CLASS
}
