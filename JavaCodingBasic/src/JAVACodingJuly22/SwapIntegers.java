package JAVACodingJuly22;

public class SwapIntegers {

	public static void main(String[] args) {
		
		int x =20;
		int y =30;
		
		//1. using third variable
		
		System.out.println("******************Third Variable**********************");
		
		int t;
		t = x; //20
		x = y; //30
		y = t; //20
		
		System.out.println("x is : " + x);  // ===> x =30
		System.out.println("y is : " + y);	// ===> y =20
		
		
		System.out.println("****************  '+' operator**********************");
		
		//2. without using third variable using + operator
		
		x = x + y; // 50
		y = x - y; // 30
		x = x - y; // 20
		
		System.out.println("x is : " + x); // ===> x =20
		System.out.println("y is : " + y); // ===> y =30	
		
		
		System.out.println("***************** '*' operator**********************");
		
		//3. without using third variable using * operator
		
		x = x * y; // 600
		y = x / y; // 20
		x = x / y ; //30
		
		
		System.out.println("x is : " + x); // ===> x =20
		System.out.println("y is : " + y); // ===> y =30	
		
		System.out.println("*********************XOR Operator************************");
		
		//4. using Bitwise Operator XOR
		
		x = x ^ y;// XOR of 20 like 1010
		y = x ^ y;
		x = x ^ y;
		
		
		System.out.println("x is : " + x); // ===> x =20
		System.out.println("y is : " + y); // ===> y =30	
		
		System.out.println("********************************************************");
		
		
		
		
		

	}

}
