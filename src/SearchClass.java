
public class SearchClass {

	//Class fields
	private int[] dataObj;
	private int aim;
	String classDescription;
	
	//Constructor
	SearchClass(String className){
		
		classDescription = String.format("This is %s class", className);
	}
	
	//Constructor
	SearchClass(String className, int[] newDataObj){
		
		classDescription = String.format("This is %s class", className);
		dataObj = newDataObj;
	}
	
	//Setter - set a new array object
	public void setDataObj(int[] newDataObj){
		
		dataObj = newDataObj;
	}
	
	//Getter - set a new array object
	public int[] getDataObj(){
			
		return dataObj;
	}
	
}
