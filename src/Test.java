import java.util.Random;

public class Test {

	static Random rnd;
	static int[] intArray;
	
	public static void main(String[] args){

		rnd = new Random();
		intArray = new int[]{6,9,1,5,8,0,12,7,30,-5,23,13,-12,7,23,8,1,9,-3,-8,18,-20,33,40,47,55};
		
		//Uncomment relevant method (see below) in order to run it
		
		//binarySearch();
		//linearSearch();
		//bubbleSort();
	}

	//Test case #1 - Binary search
	public static void binarySearch(){
		
		BinarySearch binary = new BinarySearch(intArray);
		
		for(int i = 0; i < 30; i++){
			
			int newAim = rnd.nextInt(70) - 25;
			binary.setAim(newAim);
			binary.search();
		}
	}
		
	//Test case #2 - Linear search
	public static void linearSearch(){
		
		LinearSearch linear = new LinearSearch(intArray);
				
		for(int i = 0; i < 30; i++){
					
			int newAim = rnd.nextInt(70) - 25;
			linear.setAim(newAim);
			linear.search();
		}
	}	
	
	//Test case #3 - Bubble sort
	public static void bubbleSort(){
		
		BubbleSort bubble = new BubbleSort(intArray);
		bubble.sort();
	}
	
	//END OF CLASS
}
