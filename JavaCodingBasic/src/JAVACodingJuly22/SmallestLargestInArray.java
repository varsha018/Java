package JAVACodingJuly22;

import java.util.Arrays;

public class SmallestLargestInArray {
	
		//define a variable largest and smallest with first position of array
		//compare rest of array with largest and smallest 
	//start for loop with 1
	//if next element in array is greater than largest than largest = that number
	//if next element is smaller than smallest than smallest = that number
	

	//Time Complexity O(n)  >>>>> only 1 for loop
	
	public static void main(String[] args) {

		int VarArray[] = {10 , -20 , -90 , 987, 999 , -100 };
		
		int largest = VarArray[0];
		int smallest = VarArray[0];
		
		
		for(int i =1 ; i < VarArray.length ; i ++) {
			
			if(VarArray[i] > largest) {
				largest = VarArray[i];
				
			}
			
			else if (VarArray[i] < smallest) {
				smallest = VarArray[i];
			}

			
			
		}
		
		
		
		
		System.out.println("The Given array is ::: " + Arrays.toString(VarArray));
		System.out.println("Largest Num in Array  === >" + largest);
		System.out.println("Smallest Num in Array  === >" + smallest);	
		
		
		
		

	}

}
