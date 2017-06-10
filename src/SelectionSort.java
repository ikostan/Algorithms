import java.util.Arrays;

public class SelectionSort extends SearchClass implements SearchMethod, Runnable{

	//Class fields
	static private String className = "Selection Sort";
	
	//Constructor
	SelectionSort() {
		super(className);
	}
	
	//Constructor
	SelectionSort(int[] newArray) {
		super(className, newArray);
	}

	@Override
	public void sort() {
		
		int iterations = 0;
		int[] array = new int[super.getDataObj().length];
		
		for(int i = 0; i < super.getDataObj().length; i++){
			
			array[i] = super.getDataObj()[i];
		}
		
		String start = "Unsorted array\n" + Arrays.toString(array);
		System.out.println(start + "\n");
		
		iterations = selectionSort(array, iterations, true); //ByTheBook SelectionSort metho
		
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");	
	}
	
	//ByTheBook SelectionSort method
	private int selectionSort(int[] array, int iterations, boolean isDebug){

		for(int i = 0; i < array.length; i++){
			
			int min = i;
			
			for(int j = i + 1; j < array.length; j++){
				
				if(array[min] > array[j]){
					
					min = j; //Min value index
				}
				
				iterations++; //Total iterations
			}
			
			if(array[i] > array[min]){
				
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
				
				if(isDebug){
					System.out.println(Arrays.toString(array));
				}
			}
		}
		
		return iterations;
	}
	
	
	@Override
	public void search() {}
	
	//Multi-Threading
	@Override
	public void run() {
			
		System.out.println(String.format("Thread Started -> %s", super.getDescription()));
		sort();
		System.out.println(String.format("Thread Finished -> %s\n", super.getDescription()));
	}
	
	//END OF CLASS
}
