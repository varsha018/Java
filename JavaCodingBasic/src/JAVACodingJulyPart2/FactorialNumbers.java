package JAVACodingJulyPart2;

public class FactorialNumbers {

	// for factorial of 0 return 1
	// Non-Recursive
	public static int factorial(int num) {

		int fact = 1;

		if (num == 0)
			return 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;

	}
	
	//Recursive : a function calling itself
	
	public static int factorialRecursive(int num) {
		
		if(num == 0)
		return 1;
		
		else
		return(num * factorialRecursive(num -1));
		
		
	}

	public static void main(String[] args) {

		// factorial 0 = 1
		// 4! = 4*3*2*1 =24
		// 5! = 5*4*3*2*1 =120

		int facto = factorial(0);
		System.out.println("factorial is : " + facto);
		
		System.out.println("***********************************");
		
		System.out.println(factorialRecursive(7));

	}

}
