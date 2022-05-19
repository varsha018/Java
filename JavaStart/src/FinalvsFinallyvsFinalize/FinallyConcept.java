package FinalvsFinallyvsFinalize;

public class FinallyConcept {
	
	//used with try and catch blocks
	//finally block is always executed..

	public static void main(String[] args) {
	//	test1();
		test2();

	}
	
	
	public static void test1() {
		try {
			System.out.println("try it");
			throw new RuntimeException();
		}
		catch(RuntimeException e) {
			System.out.println("catch it");
			
		}
		
		finally {
			System.out.println("finally");
		}
		
		
		
		
		
	}
	
	public static void test2() {
		try {
			System.out.println("try this");
			int i = 5/0;  				//arithematic exception..
		}
		catch(NullPointerException e) {  //we are giving null pointr exception,but 5/0 is arithemetic exception..so it will throw error..but it will not go inside catch block
			System.out.println("catch exception");  
		}
		finally {
			System.out.println("execute this");
		}
		
	}
	
	

}
