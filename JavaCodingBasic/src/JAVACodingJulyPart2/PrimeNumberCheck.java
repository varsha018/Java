package JAVACodingJulyPart2;

public class PrimeNumberCheck {
	
	//if no. = 1 or less than 1 >>return false >>not a prime number
	//if no . % i == 0 >>not a prime no.
	
	
	public static boolean isPrime(int num) {
		
	//	System.out.println("The given number is  : " + num);
			
		if(num <=1) {
			return false;
		}
		
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
		
		
	}
	
	public static void getPrimeNum(int num ) {
		
		for(int i = 2 ; i <= num ; i++ ) {
			if(isPrime(i)) {						//if isPrime returns true >>prime numbers
				System.out.print(i + " ");
			}
		}
		
	}

public static void main(String[] args) {
		
		
		//number divisible by 1 and itself
		//1 >> not a prime no.
		//2 >> lowest prime no.
		//2,3,5,7,11,13,17,19 >>>prime numbers
	
		//call the method...
	
				boolean flag = isPrime(87);
				
				if(flag == false) {
					System.out.println("It is not a prime number ");
				}else {
					System.out.println("It is a prime number");
				}
					
				System.out.println("the next series of prime numbers upto 50 are :");
				getPrimeNum(50);
				
				System.out.println();
				
				System.out.println("the next series of prime numbers upto 100 are :");
				
				getPrimeNum(100);

	}

}
