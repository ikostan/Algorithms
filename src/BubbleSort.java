import java.util.Arrays;

//Bubble sort class
public class BubbleSort extends SearchClass implements SearchMethod{

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
		boolean isSorted = true;
		
		//iterations = methodByTheBook(array, isSorted, iterations); //By the book method
		iterations = methodCustom(array, isSorted, iterations); //My custom method
			
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");
	}
	
	//By the book method
	private int methodByTheBook(int[] array, boolean isSorted, int iterations){
		
		for(int i = 0; i < array.length - 1; i++){
			
			isSorted = true;
			
			for(int b = 0; b < array.length - i - 1; b++){
					
				if(array[b] > array[b + 1]){
						
					int temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
					isSorted = false;
				}
					
				iterations++;
			}
			
			if(isSorted){
				//Array is sorted
				break;
			}
		}
		
		return iterations;
	}
	
	//My custom method
	private int methodCustom(int[] array, boolean isSorted, int iterations){
		
		for(int i = 0; i < array.length - 1; i++){
			
			isSorted = true;
			
			for(int b = i + 1; b < array.length - 1; b++){
					
				if(array[i] > array[b]){
						
					int temp = array[b];
					array[b] = array[i];
					array[i] = temp;
					isSorted = false;
				}
					
				iterations++;
			}
			
			if(isSorted){
				//Array is sorted
				break;
			}
		}
		
		return iterations;
	}
	
	@Override
	public void search(){}

	//END OF CLASS
}
