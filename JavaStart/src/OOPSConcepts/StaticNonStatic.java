package OOPSConcepts;

public class StaticNonStatic {

		static long  mobile = 98385;
		static String phone="45";
		int o=9;
		
	
	public static void main(String[] args) {
		//static method and variables can be accessed directly or by class names...
		System.out.println(mobile);
		System.out.println(StaticNonStatic.mobile);
		sum();
		StaticNonStatic.sum();
		System.out.println(phone);
		
		
		
		//for non-static you need to create an object
		StaticNonStatic new1 = new StaticNonStatic();
		System.out.println(new1.o);
		new1.sum1();
		new1.sum();
		//new1.mobile;
		
		

	}
	
	
	public static void sum() {
		System.out.println("sum method");
	}
	
	public void sum1() {
		System.out.println("sum1 method");
		
		
	}

}
