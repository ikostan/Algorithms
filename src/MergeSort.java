
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
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void search() {}

	//Multi-Threading
	@Override
	public void run() {
			
		System.out.println(String.format("Thread Started -> %s", super.getDescription()));
		search();
		System.out.println(String.format("Thread Finished -> %s\n", super.getDescription()));
	}
	
	//END OF CLASS
}
