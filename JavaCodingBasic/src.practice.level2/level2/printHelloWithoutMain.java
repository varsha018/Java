package level2;

public class printHelloWithoutMain {

	public static void main(String[] args) {
		
		//main method should be blank .. without using static block print "hello world"

	}
	
	//create a static method, create return type 
	public static int printString() {
		System.out.println("Hello World");
		return 1;
		
	}
	

	
	//using a static variable , call the static method...
	static int a = printString();

}
