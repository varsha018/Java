package JAVACodingJulyPart3;

public class MissingNum2 {

	public static void main(String[] args) {
	
		int num[] = {1,2,3,4, 5, 7};
		
		int y = NumCheck(num , 7);
		
		System.out.println("Missing Number is : " + y );
		

	}

	
	public static int NumCheck(int num[] , int TotalCount) {
		
		int ExpSum = (TotalCount * (TotalCount+1))/2; //total = n(n+1)/2
		int ActSum = 0;
		
		for(int i : num ) {
			ActSum +=  i;
		}
		
		return ExpSum-ActSum;
	}
}
