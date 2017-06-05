import java.util.Arrays;

public class MergeSort extends SearchClass implements SearchMethod, Runnable{

	//Class fields
	static private String className = "Merge Sort";

	//Constructor
	MergeSort() {
		super(className);
	}
	
	//Constructor
	MergeSort(int[] newArray) {
		super(className, newArray);
	}
	
	@Override
	public void sort() {
		
		int iterations = 0;
		
		int[] array =  new int[super.getDataObj().length];
		
		for(int indx = 0; indx < super.getDataObj().length; indx++){
			array[indx] = super.getDataObj()[indx];
		}
		
		String start = "Unsorted array\n" + Arrays.toString(array);
		System.out.println(start + "\n");
		
		mergeSort(array, 0, array.length - 1); //Main MergeSort method
		
		String output = "\nArray is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");
	}
		
	//Recursive MergeSort method
	private static void mergeSort(int[] inputArray, int start, int end){
			
		if(start < end){
			
			int mid = (start + end) / 2;
			mergeSort(inputArray, start, mid);
			mergeSort(inputArray, mid + 1, end);
			merge(inputArray, start, mid, end); //Merge method
			//mergeTwo(inputArray, start, mid, end); //Experimental merge method
		}
	}
	
	//Merge method
	private static void merge(int[] inputArray, int start, int mid, int end){
		
		//Left side
		int[] LEFT = new int[mid - start + 2];
		
		for(int i = start; i < mid + 1; i++){
			
			LEFT[i - start] = inputArray[i];
		}
		LEFT[mid - start + 1] = Integer.MAX_VALUE;
		
		//Right side
		int[] RIGHT = new int[end - mid + 1];
		
		for(int i = mid + 1; i < end + 1; i++){
			
			RIGHT[i - mid - 1] = inputArray[i];
		}
		RIGHT[end - mid] = Integer.MAX_VALUE;
		
		//Merge
		int i=0, j=0; 
		for(int k = start; k < end + 1; k++){
			
			if(LEFT[i] < RIGHT[j]){
				
				inputArray[k] = LEFT[i];
				i++;
			}
			else{
				
				inputArray[k] = RIGHT[j];
				j++;
			}
		}
	}
	
	//Testing merge method
	private static void mergeTwo(int[] array, int start, int mid, int end){

		int[] LEFT = new int[mid - start + 2];	
		
		for(int i = start; i < mid + 1; i++){
		
			LEFT[i - start] = array[i];
		}	
		LEFT[mid - start + 1] = Integer.MAX_VALUE;

		int[] RIGHT= new int[end - mid + 1];	
		
		for(int i = mid + 1; i < end + 1; i++){
		
			RIGHT[i - mid - 1] = array[i];	
		}
		RIGHT[end - mid] = Integer.MAX_VALUE;

		int i = 0, j = 0, k = start;

		while(i < mid + 1 && k < end + 1){
			
			if(LEFT[i] < RIGHT[j]){
			
				array[k] = LEFT[i];
				i++;
			}
			else{

				array[k] = RIGHT[j];
				j++;
			}		

			k++;
		}		
	}	
	
	@Override
	public void search() {}

	//Multi-Threading
	@Override
	public void run() {
			
		System.out.println(String.format("Thread Started -> %s\n", super.getDescription()));
		sort();
		System.out.println(String.format("Thread Finished -> %s\n", super.getDescription()));
	}
	
	//END OF CLASS
}
