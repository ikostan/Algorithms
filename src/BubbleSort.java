import java.util.Arrays;

//Bubble sort class
public class BubbleSort extends SearchClass implements SearchMethod, Runnable{

	//Class fields
	static private String className = "Bubble Sort";
	
	//Constructor
	BubbleSort(){
		super(className);
	}
	
	//Constructor
	BubbleSort(int[] newDataObj){
		super(className, newDataObj);
	}

	//BubbleSort algorithm
	@Override
	public void sort(){
		
		int iterations = 0;		
		int[] array =  new int[super.getDataObj().length];
		for(int indx = 0; indx < super.getDataObj().length; indx++){
			array[indx] = super.getDataObj()[indx];
		}
			
		String start = "Unsorted array\n" + Arrays.toString(array);
		System.out.println(start + "\n");
		boolean isSorted = false;
		
		iterations = bubbleSort(array, iterations, isSorted, true); //By the book method
			
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");
	}
	
	
	//BubbleSort method
	private int bubbleSort(int[] array, int iterations, boolean isSorted, boolean isDebug){
		
		for(int i = 0; i < array.length - 1; i++){
			
			int swaps = 0;
			
			for(int j = 0; j < array.length - i - 1; j++){
				
				if(array[j] > array[j+1]){
					
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swaps++;
				}
				
				iterations++; //Total iterations
			}
			
			if(isDebug){
				//Debug
				System.out.println(Arrays.toString(array));
			}
		}
		
		return iterations;
	}
	
	
	@Override
	public void search(){}

	//Multi-Threading
	@Override
	public void run() {
		
		System.out.println(String.format("Thread Started -> %s", super.getDescription()));
		sort();
		System.out.println(String.format("Thread Finished -> %s\n", super.getDescription()));
	}

	//END OF CLASS
}
