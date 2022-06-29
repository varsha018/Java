package JAVACodingJuly22;

public class ReverseByStringBuffer {
		
	//create object of string buffer class ..pass string in the object..
	//use reverse function to reverse string
	
	
	public static void main(String[] args) {

		String s ="This is a pen";
		
		StringBuffer sb = new StringBuffer(s); //pass the string variable in String Buffer class
		System.out.println(sb.reverse());
		
		
		//convert the integer into String using String.valueof(i)
		//use reverse function to reverse the string
		
		int i = 123456;
		long k =987786;
		System.out.println(new StringBuffer(String.valueOf(i)).reverse()); //create object of string buffer 
																		//change integer value to String
																		//reverse the string.
		
		
		
		System.out.println(new StringBuffer(String.valueOf(k)).reverse());
		

	}

}
