import java.util.Arrays;

//Bubble sort class
public class BubbleSort extends SearchClass implements SearchMethod{

	//Class fields
	static private String className = "Bubble Sort";
	
	//Constructor
	BubbleSort() {
		super(className);
	}
	
	//Constructor
	BubbleSort(int[] newDataObj) {
		super(className, newDataObj);
	}

	//BubbleSort algorithm
	@Override
	public void sort() {
		
		int iterations = 0;		
		int[] array =  new int[super.getDataObj().length];
		for(int indx = 0; indx < super.getDataObj().length; indx++){
			array[indx] = super.getDataObj()[indx];
		}
			
		for(int i = 0; i < array.length - 1; i++){
				
			for(int b = i + 1; b < array.length; b++){
					
				if(array[i] > array[b]){
						
					int temp = array[b];
					array[b] = array[i];
					array[i] = temp;
				}
					
				iterations++;
			}
		}
			
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray);
	}
	

	@Override
	public void search() {}

	//END OF CLASS
}
