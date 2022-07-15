package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {3,2,6,9,0,4,87,11,45,23}; 
		
		BubbleS(arr);
	}
	
	
	public static void BubbleS(int arr[]) {
		
		
		for(int i = 0 ; i < arr.length ; i++) { //counter
			
			for(int j = 0 ; j < arr.length - i -1 ; j++) { //inner loop for swapping big numbers at the end
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;				
				}

			}
		}
		
		for(int k = 0 ;k <arr.length ; k++) {
			System.out.println(arr[k] + "");
			
		}
	
		
		
	}

}
