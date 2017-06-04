import java.util.Arrays;

public class SelectionSort extends SearchClass implements SearchMethod{

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
		// TODO Auto-generated method stub
		int iterations = 0;
		int[] array = new int[super.getDataObj().length];
		
		for(int i = 0; i < super.getDataObj().length; i++){
			
			array[i] = super.getDataObj()[i];
		}
		
		String start = "Unsorted array\n" + Arrays.toString(array);
		System.out.println(start + "\n");
		
		int min, minIndx;
		boolean isSorted;
		
		//SelectionSort
		for(int a = 0; a < array.length - 1; a++){
			
			min = array[a];
			minIndx = a;
			isSorted = true;
			
			for(int b = a + 1; b < array.length; b++){
				
				if(array[b] < min){
					
					min = array[b];
					minIndx = b;
					isSorted = false;
				}
				
				iterations++;
			}
			
			if(minIndx > a){
				
				int temp = array[minIndx];
				array[minIndx] = array[a];
				array[a] = temp;
			}
			else if(isSorted == true){
				
				break;
			}
		}
				
		String output = "Array is sorted after " + iterations + " iterations";
		String sortedArray = Arrays.toString(array);
		System.out.println(output + "\n" + sortedArray + "\n");	
	}
	
	@Override
	public void search() {}
	
	//END OF CLASS
}
