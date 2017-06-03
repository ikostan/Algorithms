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
		
		for(int i = 0; i < array.length - 1; i++){
				
			for(int b = i + 1; b < array.length - 1; b++){
					
				if(array[i] > array[b]){
						
					int temp = array[i];
					array[i] = array[b];
					array[b] = temp;
				}
					
				iterations++;
			}
		}
			
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray);
	}
	
	@Override
	public void search(){}

	//END OF CLASS
}
