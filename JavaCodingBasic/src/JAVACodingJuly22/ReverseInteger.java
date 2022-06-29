package JAVACodingJuly22;

public class ReverseInteger {
	
	//initiate a integer z with 0.. and multiply z  by 10 and add y with modulus of 10
	//convert the original number by dividing it by 10
	

	public static void main(String[] args) {

		int y = 987654321;

		int z = 0;
		
		System.out.println("The Given Integer is   ===> " +   y );
		
		while (y != 0) {

			z = z * 10 + y % 10;
			y = y / 10;

		}
		
		
		System.out.println("The Reverse Integer is ===> " + z );

	}

}
