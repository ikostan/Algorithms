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
		
		//iterations = customSort(array, iterations); //Custom method
		//iterations = conventionalTwo(array, iterations); //Custom method
		iterations = conventionalSort(array, iterations); //ByTheBook SelectionSort metho
		
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");	
	}
	
	//ByTheBook SelectionSort method
	private int conventionalSort(int[] array, int iterations){

		for (int j = 0; j < array.length - 1; j++){

		    int iMin = j;
		    
		    for (int i = j + 1; i < array.length; i++) {

		    	if (array[i] < array[iMin]) {
		    		
		            iMin = i;
		        }
		    	
		    	iterations++;
		    }

		    if(iMin != j) 
		    {
		        int temp = array[j];
		        array[j] = array[iMin];
		        array[iMin] = temp;
		    }
		}
		
		return iterations;
	}
	
	//ByTheBook SelectionSort method (Source: http://www.geeksforgeeks.org/selection-sort/)
	private int conventionalTwo(int[] array, int iterations){
		
		int n = array.length;
		 
        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < n - 1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            
            for (int j = i + 1; j < n; j++){
            	
                if (array[j] < array[min_idx]){
                	
                    min_idx = j;
                }

            	iterations++;
            }
            // Swap the found minimum element with the first element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        
        return iterations;
	}
	
	//My custom SelectionSort method
	private int customSort(int[] array, int iterations){
		
		int min, minIndx;
		//boolean isSorted;
		
		//SelectionSort
		for(int a = 0; a < array.length - 1; a++){
			
			min = array[a];
			minIndx = a;
			
			for(int b = a + 1; b < array.length; b++){
				
				if(array[b] < min){
					
					min = array[b];
					minIndx = b;
					//isSorted = false;
				}
				
				iterations++;
			}
			
			if(minIndx > a){
				
				int temp = array[minIndx];
				array[minIndx] = array[a];
				array[a] = temp;
			}
			else{
				//Array is sorted
				break;
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
