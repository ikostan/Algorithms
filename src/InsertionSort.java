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
		
		//custoMethod(array, iterations); //My custom method with optimization
		byTheBook(array, iterations);   //By the book method with optimization
	}
		
	//My custom method
	private void custoMethod(int[] array, int iterations){
			
		for(int i = 1; i < array.length; i++){
				
			for(int b = i; b > 0; b--){

				if(array[b - 1] > array[b]){
							
					int temp = array[b - 1];
					array[b - 1] = array[b];
					array[b] = temp;
				}
				else if(array[b - 1] < array[b]){
							
					break;
				}
						
				iterations++;
			}		
		}
			
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");
		
	}

	
	//By the book method
	private void byTheBook(int[] array, int iterations){
		
		int i, j, key, temp;
		
		for (i = 1; i < array.length; i++) {
			key = array[i];
			j = i - 1;
			while (j >= 0 && key < array[j]) {
				
				iterations++;
				
				if(array[j] > key){
					
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					j--;
				}
				else if(array[j] < key){
					
					break;
				}
				
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
