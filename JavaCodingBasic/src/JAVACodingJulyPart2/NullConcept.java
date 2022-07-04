package JAVACodingJulyPart2;

public class NullConcept {
	
	static Object obj; //null is assigned
	static String str; //null is assigned
	static int i; //0 is assigned
	
	
	public static void main(String[] args) {
		
		
		/*
		 * //1.Case Sensitive >> null always in small letters
		 * 
		 * String j = Null; // >> not correct
		 * 
		 * String str = null; // >>correct
		 */
		
		//2.object default reference variable for the classes will be null >> whenever you declare a variable will be null
		
		/*
		 * 
		 * System.out.println(str); //output : null 
		 * System.out.println(obj); //output : null 
		 * 
		 * System.out.println(i); //>>> output : 0
		 */
		
		
		//3>cannot assign Integer Class to int datatype >>> Integer class can be null
		
		/*
		 * Integer i = null; //Integer is a wrapper class 
		 * int j = i; // this is a primitive datatype>>you cannot assign to Integer Class >>NullPointerException
		 * System.out.println(j);
		 */
		
		
		//4.
		
		Integer i =null;
		Integer j = 10;
		
//		System.out.println(j instanceof Integer); // j is Instance of Integer
		
//		System.out.println(i instanceof Integer); //i is not instance of Integer as it is pointing to Null
		
		
		//5 static Vs Non-static
		
		//create obj of class pointing to null
		
//		NullConcept obj = null;
		
//		obj.sum(); //when class obj created is null, you can access static methods
		
//		obj.diff();  //.NullPointerException >> you cannot access non-static method when class object created is null
		
		//6. == !=
		
		System.out.println(null == null);
		System.out.println(null != null);
		
		
		//7 >>type cast
		
		String s1 = (String)null;
		System.out.println(s1 + "varsha");  //allowed
		System.out.println(s1.length());   //NullPointerException

	}
	
	public static void sum() { //static method
		System.out.println("sum...");
	}
	
	public void diff() {  //non-static method
		System.out.println("diff...");
		
	}

}
