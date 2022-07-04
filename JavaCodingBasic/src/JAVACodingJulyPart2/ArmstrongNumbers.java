package JAVACodingJulyPart2;

public class ArmstrongNumbers {
	
	
	public static void isArmstrong(int num ) {
		
		int r =0;
		int cube =0;
		int t = num;
		
		while(num > 0) {
			
			r = num %10;
			cube = cube + (r*r*r);
			num = num/10;
			
		}
		

		if(cube == t) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrng Number");
		}
		
		
		
		
	}

	public static void main(String[] args) {

		//The cube of all the numbers = the given number
		//153 =1^3 + 5^3 + 3^3 = 1+125+27 = 153
		//407 , 0 , 1 , 370 , 371 >> Armstrong number
		
		
		isArmstrong(153);
		
		
		
		
		
		
		

	}

}
