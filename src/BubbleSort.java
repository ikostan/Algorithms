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
		boolean isSorted = true;
		
		////iterations = methodByTheBook(array, isSorted, iterations); //By the book method(wrong implementation)
		//iterations = conventionalMethod(array, isSorted, iterations); //By the book method
		//iterations = hackerRankVersion(array, isSorted, iterations);
		iterations = methodCustom(array, isSorted, iterations); //My custom method
			
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");
	}
	
	//By the book method
	private int methodByTheBook(int[] array, boolean isSorted, int iterations){
		
		for(int i = 0; i < array.length - 1; i++){
			
			isSorted = true;
			
			for(int b = 0; b < array.length; b++){
					
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
	
	//By the book method
	private int conventionalMethod(int[] array, boolean isSorted, int iterations){
			
		for(int i=0; i < array.length - 1; i++){ 
			
			for(int j=1; j < (array.length - i); j++){
            	
				if(array[j-1] > array[j]){  
					//swap elements  
					int temp = array[j-1];  
					array[j-1] = array[j];  
					array[j] = temp;  
				}  
				
				iterations++;   
			}  
		}  
						
		return iterations;
	}
	
	//By the book method
	private int hackerRankVersion(int[] array, boolean isSorted, int iterations){
		
		isSorted = false;
		int lastUnsorted = array.length - 1;
		
		while(!isSorted){
			
			isSorted = true;
			for(int i = 0; i < lastUnsorted; i++){
				
				if(array[i] > array[i + 1]){
					
					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					
					isSorted = false;
				}
				
				iterations++;
			}
		}
		
		return iterations;
	}
	
	//My custom method
	private int methodCustom(int[] array, boolean isSorted, int iterations){
		
		for(int i = 0; i < array.length - 1; i++){
			
			isSorted = true;
			
			for(int b = i + 1; b < array.length; b++){
					
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

	//Multi-Threading
	@Override
	public void run() {
		
		System.out.println(String.format("Thread Started -> %s", super.getDescription()));
		sort();
		System.out.println(String.format("Thread Finished -> %s\n", super.getDescription()));
	}

	//END OF CLASS
}
