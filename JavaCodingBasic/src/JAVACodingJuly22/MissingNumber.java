package JAVACodingJuly22;

public class MissingNumber {

	//to find 1 missing number from array
	//sum of all number till the end minus sum of total numbers in the array
	//create for loop for each and take out the difference..
	
	
	public static void main(String[] args) {
		
		int a[] = {-2,-1,1,2,4,5};
		
		int sum = 0;
		
		for(int i = 0 ; i < a.length ; i ++ ) {
			sum = sum + a[i];
		}
		
		System.out.println("array sum ===> " + sum);
		
		int sum1 = 0;
		
		for(int j = -2 ; j < 6 ; j++ ) {
			
			sum1 = sum1 + j ; 
		}
		
		System.out.println("total sum ===> " + sum1);
		
		
		System.out.println("Missing Number ===> " + (sum1-sum));
		
	}

	
	
	
	
	
	
}
