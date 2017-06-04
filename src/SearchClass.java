
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
	
	//Constructor
	SearchClass(String className, int[] newDataObj, int newAim){
			
		classDescription = String.format("This is %s class", className);
		dataObj = newDataObj;
		aim = newAim;
	}
	
	//Setter - set a new array object
	public void setDataObj(int[] newDataObj){
		
		dataObj = newDataObj;
	}
	
	//Getter - set a new array object
	public int[] getDataObj(){
			
		return dataObj;
	}
	
	//Setter - set a new aim
	public void setAim(int newAim){
			
		aim = newAim;
	}
		
	//Getter - set a new aim
	public int getAim(){
				
		return aim;
	}
	
	//Get class name/description
	public String getDescription(){
		
		return classDescription;
	}
	
	//END OF CLASS
}
