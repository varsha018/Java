package JAVACodingJulyPart4;

public class NullArgument {
	
	//pass null argument with method overriding with string and object arguments

	public static void main(String[] args) {
		
		test(null);  //String and Object both can have null values
		

	}
	
	public static void test(Object o) { //object is super class of string >> which datatype it will take is not so obvious..
		System.out.println("Object argument");
	}
	
	
	public static void test(String s) { //compiler is smart >> it will pick string as it is obvious datatype
		System.out.println("String argument");
	}
}
