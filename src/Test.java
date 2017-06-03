import java.util.Random;

public class Test {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intArray = new int[]{6,9,1,5,8,0,12,7,23,18,33,40};
		
		//Test case #1 - Binary search
		BinarySearch binary = new BinarySearch(intArray);
		
		for(int i = 0; i < 25; i++){
			
			int newAim = rnd.nextInt(50) - 5;
			binary.setAim(newAim);
			binary.search();
		}
		
		
	}

	
	//END OF CLASS
}
