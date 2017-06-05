import java.util.Random;

public class Test {

	static Random rnd;
	static int[] intArray;
	
	static Thread bnThread, lnThread, blThread, selectThread, insertThread, mrgThread, quickThread;
	
	public static void main(String[] args){

		rnd = new Random(); //Random object
		
		//Test data
		intArray = new int[]{50,6,5,0,12,30,-5,23,13,-12,7,2,3,4,8,1,9,-3,-8,18,-20,33,40,47,55}; 
				
		//intArray = new int[]{5,4,3,2,1};
		
		BinarySearch binary = new BinarySearch(intArray);
		bnThread = new Thread(binary);
		
		LinearSearch linear = new LinearSearch(intArray);	
		lnThread = new Thread(linear);
		
		BubbleSort bubble = new BubbleSort(intArray);
		blThread = new Thread(bubble);
		
		InsertionSort insertion = new InsertionSort(intArray);
		insertThread = new Thread(insertion);
		
		SelectionSort selection = new SelectionSort(intArray);
		selectThread = new Thread(selection);
		
		MergeSort merge = new MergeSort(intArray);
		mrgThread = new Thread(merge);
		
		int newAim;	
			
		newAim = rnd.nextInt(70) - 25;
			
		linear.setAim(newAim);
		binary.setAim(newAim);
			
		runThreads(); //Multi-Threaded process
		
		//Uncomment relevant method (see below) in order to run it (NOTE: single-threaded)

		//binarySearch();
		//linearSearch();
		//bubbleSort();
		//insertionSort();		
		//selectionSort();
		//quickSort();
		//mergeSort();
	}

	//Run threads
	private static void runThreads(){
		
		//lnThread.start();
		//bnThread.start();
		//blThread.start();
		//insertThread.start();
		//selectThread.start();
		mrgThread.start();
		//quickThread.start();
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
		//Thread lnThread = new Thread(linear);
		
		for(int i = 0; i < 30; i++){
					
			int newAim = rnd.nextInt(70) - 25;
			linear.setAim(newAim);
			linear.search();
			//lnThread.start();
		}
	}	
	
	//Test case #3 - Bubble sort
	public static void bubbleSort(){
		
		BubbleSort bubble = new BubbleSort(intArray);
		bubble.sort();
	}
	
	//Test case #4 - Insertion sort
	public static void insertionSort(){
		
		InsertionSort insertion = new InsertionSort(intArray);
		insertion.sort();
	}
	
	//Test case #5 - Selection sort
	public static void selectionSort(){
		
		SelectionSort selection = new SelectionSort(intArray);
		selection.sort();
	}
	
	//Test case #6 - Quick sort
	public static void quickSort(){
	
		QuickSort quick = new QuickSort(intArray);
		quick.sort();
	}	

	//Test case #7 - Merge sort
	public static void mergeSort(){
	
		MergeSort merge = new MergeSort(intArray);
		merge.sort();
	}

	//END OF CLASS
}
