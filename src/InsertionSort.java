import java.util.Arrays;

//Insertion sort class
public class InsertionSort extends SearchClass implements SearchMethod, Runnable {

	//Class fields
	static private String className = "Insertion Sort";
	
	//Constructor
	InsertionSort() {
		super(className);
		// TODO Auto-generated constructor stub
	}
	
	//Constructor
	InsertionSort(int[] newDataObj){
		super(className, newDataObj);
	}

	//Insertion Sort algorithm
	@Override
	public void sort() {

		int iterations = 0;		
		int[] array =  new int[super.getDataObj().length];
		for(int indx = 0; indx < super.getDataObj().length; indx++){
			array[indx] = super.getDataObj()[indx];
		}
			
		String start = "Unsorted array\n" + Arrays.toString(array);
		System.out.println(start + "\n");
		
		insertionSort(array, iterations, true);   //By the book method with optimization
	}
			
	//By the book method
	private void insertionSort(int[] array, int iterations, boolean isDebug){
		
		for(int i = 0; i < array.length - 1; i++){
			
			int j = i + 1;
			
			while((j > 0) && (array[j] < array[j-1])){
				
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j--;
				
				iterations++; //Total number of iterations
			}
			
			iterations++;
			if(isDebug){
				System.out.println(Arrays.toString(array)); //Debug
			}
		}
		
				
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");
			
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
