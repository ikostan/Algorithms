import java.util.Arrays;

public class BinarySearch extends SearchClass implements SearchMethod {
	
	//Class fields
	static private String className = "Binary Search";
	
	//No Arguments Constructor
	BinarySearch() {
		super(className);
	}
	
	//Constructor
	BinarySearch(int[] newDataObj) {
			super(className, newDataObj);
	}
	
	//Constructor
	BinarySearch(int[] newDataObj, int newAim) {
		super(className, newDataObj, newAim);
	}
	
	//Binary search method
	@Override
	public void search() {
		
		int start = 0;
		int end = this.getDataObj().length - 1;
		int mid = (start + end) / 2;
		int iterations = 0;
		String array = Arrays.toString(this.getDataObj());
		String output = "";
		
		while(true){
			
			int var = this.getDataObj()[mid];
			
			if(var == super.getAim()){
				
				output = String.format("\"%d\" has been found at index %d after %d iterations", super.getAim(), mid, iterations);
				System.out.println(array + "\n" + output + "\n");
				break;
			}
			else if(var < super.getAim()){
				
				start = mid + 1;
				mid = (start + end) / 2;
			}
			else if(var > super.getAim()){
				
				end = mid - 1;
				mid = (start + end) / 2;
			}
			
			if(end < start){
				output = String.format("\"%d\" has not been found after %d iterations", super.getAim(), iterations);
				System.out.println(array + "\n" + output + "\n");
				break;
			}
			
			iterations++;
		}
	
	}
	
	public int[] getDataObj(){
		
		int[] obj = super.getDataObj();
		Arrays.sort(obj);
		return obj;
	}

	
	//END OF CLASS
}
