package JAVACodingJulyPart4;

public class StringObjects {
	
	// when we create an object of the String --> 2 objects are created
	//1 in SCP (String Constant Pool) and 1 in heap memory
	//object reference will be stored in stack memory
	
	//In SCP >> all unique values of Strings get stored. if 2 objects are created with the same name >> only for the first time object will get created in SCP 
	//next time the object would only be stored in heap memory...
	
	
	
	
	

	public static void main(String[] args) {
		
		String s1 = "hello"; //1 obj in SCP
		String s2 = "hello"; // same as s1, no object created>>no new keyword
		String s3 = "hello"; // same as s1, no object created>>no new keyword
		
		String n1 = new String("hello"); //1 obj in heap memory //no obj in SCP
		String n2 = new String ("hello");//1 obj in heap memory //no obj in SCP
		
		//total how many objects are created? >>>total 3 objects created
		
		
		System.out.println(s1 == s2); //true >> same reference in SCP
		System.out.println(s2 == s3);  //true >> same reference in SCP
		System.out.println(s1 == s3);  //true >> same reference in SCP
		System.out.println(n1 == s2);  //False >> 1 reference in SCP and 1 new obj in heap
		System.out.println(n1 == n2); //False >> 2 new obj in heap memory
		
		
		
		
		
	

	}

}
